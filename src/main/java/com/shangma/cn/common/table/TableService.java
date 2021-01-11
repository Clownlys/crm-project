package com.shangma.cn.common.table;

import com.shangma.cn.utils.ReflectionUtils;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author clownly
 * @create 2021-01-07 22:34
 */
public class TableService {

     final static  String  STRING = String.class.getName();
     final static  String  DATE =Date.class.getName();
     final static  String LONG = Long.class.getName();
     final static  String BIGDECIMAL = BigDecimal.class.getName();

    public static <T> ByteArrayOutputStream  writeExcel(String sheetName, List<T> list, Class clazz) throws IllegalAccessException, IOException {
        Workbook workbook = new XSSFWorkbook();

        Sheet sheet = workbook.createSheet(sheetName);


        Field[] fields = clazz.getDeclaredFields();

        System.out.println("字段数量："+fields.length);
        Row fieldNameRow = sheet.createRow(0);
        for (int i = 0; i < fields.length; i++) {
            Cell cell = fieldNameRow.createCell(i);
            cell.setCellValue(fields[i].getName());
        }

        for (int i = 1; i <= list.size(); i++) {
            Row row = sheet.createRow(i);
            for (int j = 0; j < fields.length; j++) {
                Cell cell = row.createCell(j);

                fields[j].setAccessible(true);

//                System.out.print(s+"\t");


                Field field = fields[j];
                field.setAccessible(true);
                String name = field.getType().getName();



                if(name.equalsIgnoreCase(STRING)){
                    String s = field.get(list.get(i - 1)).toString();
                    cell.setCellValue(s);
                }else if(name.equalsIgnoreCase(DATE)){
                    Date date = (Date) field.get(list.get(i - 1));
                    cell.setCellValue(date);
                }else if(name.equalsIgnoreCase(LONG)){
                    Long l = (Long)field.get(list.get(i - 1));
                    cell.setCellValue(l.doubleValue());
                }else if(name.equalsIgnoreCase(BIGDECIMAL)){
                    BigDecimal bigDecimal = (BigDecimal)field.get(list.get(i-1));
                    cell.setCellValue(bigDecimal.doubleValue());
                }





            }
//            System.out.println();

        }
        //写入本地文件
//        FileOutputStream out = new FileOutputStream("C:\\Users\\JAVASM\\Downloads\\orderExport.xlsx");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //写出工作簿
        workbook.write(out);


        //关闭资源
        workbook.close();
        out.close();

        return out;


    }


    public static List readExcel(InputStream in,Class clazz) throws IOException, IllegalAccessException, InstantiationException {
        //创建工作簿
        Workbook workbook = new XSSFWorkbook(in);
        //拿到sheet,可以通过sheet名获取 getSheet（string）,也可以通过索引获取

        Sheet sheet = workbook.getSheetAt(0);
        //通过sheet获取行
        int maxRow = sheet.getLastRowNum();
        System.out.println("总行数为：" + maxRow);
        Row fieldNameRow = sheet.getRow(0);
        List<Field> fields = new ArrayList<>();
        for (int i = 0; i < fieldNameRow.getLastCellNum();i++) {
            try {
                Field field = clazz.getDeclaredField(fieldNameRow.getCell(i).getStringCellValue());
                fields.add(field);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

        }

        System.out.println(clazz.getName());
        fields.forEach(field -> {
            System.out.println(field.getName());
            System.out.println(field.getType());
        });


        List instances = new ArrayList<>();

        if(fields.size()==fieldNameRow.getLastCellNum()){
            for (int row = 1; row <= maxRow; row++) {

                //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
                Row currentRow = sheet.getRow(row);
                int maxRol = sheet.getRow(row).getLastCellNum();
                Object o = clazz.newInstance();
                System.out.println("--------第" + row + "行的数据如下--------");
                for (int rol = 0; rol < maxRol; rol++){
                    Cell cell = currentRow.getCell(rol);

//                    System.out.print(cell.getStringCellValue()+"  ");
                    Field field = fields.get(rol);
                    field.setAccessible(true);
                    Class<?> type = field.getType();
//                    System.out.println(cell.getCellTypeEnum());
                    if(type.getName().equalsIgnoreCase(STRING)){
                        field.set(o,cell.getStringCellValue());
                    }else if(type.getName().equalsIgnoreCase(DATE)){
                        field.set(o,cell.getDateCellValue());
                    }else if(type.getName().equalsIgnoreCase(LONG)){
                        field.set(o,new Double(cell.getNumericCellValue()).longValue());
                    }else if(type.getName().equalsIgnoreCase(BIGDECIMAL)){
                        field.set(o,new BigDecimal(cell.getNumericCellValue()));
                    }

//                    System.out.print(sheet.getRow(row).getCell(rol) + "  ");
                }
                instances.add(o);
                System.out.println(o.toString());
                System.out.println();
            }
        }


        return instances;
//        Row row = sheet.getRow(1);
//        Cell cell = row.getCell(1);
//        System.out.println(cell.getStringCellValue());
    }

    public Object getCellValue(Cell cell){
        Object obj=null;
        CellType cellTypeEnum = cell.getCellTypeEnum();
        switch (cellTypeEnum){
            case STRING:
                obj=cell.getStringCellValue();
                break;
            case BLANK:
                obj="";
                break;
            case NUMERIC:
                if(DateUtil.isCellDateFormatted(cell)){
                    obj=cell.getDateCellValue();
                }else {
                    obj=cell.getNumericCellValue();
                }
                break;
            case FORMULA:
                obj=cell.getCellFormula();
                break;
        }
        return obj;
    }
}
