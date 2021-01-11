package com.shangma.cn.service.impl;

import com.shangma.cn.common.file.UploadService;
import com.shangma.cn.common.table.TableService;
import com.shangma.cn.entity.Order;
import com.shangma.cn.entity.OrderExample;
import com.shangma.cn.entity.vo.OrderVo;
import com.shangma.cn.mapper.base.BaseMapper;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author clownly
 * @time 20:34
 */
@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order, Long> implements OrderService {


    @Autowired
    private UploadService uploadService;
    @Autowired
    private OrderAssetsServiceImpl orderAssetsService;

    @Override
    public PageVo<Order> findByCondition(Map<String, Object> condition) {

        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        Long orderId = (Long) condition.get("orderId");
        Byte orderType = (Byte) condition.get("orderType");
        Byte payType = (Byte) condition.get("payType");
        Byte bussinessType = (Byte) condition.get("bussinessType");
        Date beginTime = (Date) condition.get("beginTime");
        Date endTime = (Date) condition.get("endTime");
        Byte orderAction = (Byte) condition.get("orderAction");
        Byte orderStatus = (Byte) condition.get("orderStatus");

        if(!orderId.equals(-1L)){
            System.out.println("这里是orderId");
            criteria.andIdEqualTo(orderId);
        }

        if(!orderType.equals(new Byte("-1"))){
            System.out.println("这里是orderType");
            criteria.andOrderTypeEqualTo(orderType);
        }
        if(!payType.equals(new Byte("-1"))){
            criteria.andPayTypeEqualTo(payType);
        }
        if(!bussinessType.equals(new Byte("-1"))){
            criteria.andBussinessTypeEqualTo(bussinessType);
        }
        criteria.andOrderCreateTimeBetween(beginTime,endTime);
        if(!orderAction.equals(new Byte("-1"))){
            criteria.andOrderActionEqualTo(orderAction);
        }
        if(!orderStatus.equals(new Byte("-1"))){
            criteria.andOrderStatusEqualTo(orderStatus);
        }
        return setPage(getBaseMapper().selectByExample(orderExample));

    }

    @Override
    public String exportExcel(HashMap<String, Object> condition) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        Long orderId = (Long) condition.get("orderId");
        Byte orderType = (Byte) condition.get("orderType");
        Byte payType = (Byte) condition.get("payType");
        Byte bussinessType = (Byte) condition.get("bussinessType");
        Date beginTime = (Date) condition.get("beginTime");
        Date endTime = (Date) condition.get("endTime");
        Byte orderAction = (Byte) condition.get("orderAction");
        Byte orderStatus = (Byte) condition.get("orderStatus");


        //条件拼接
        if(!orderId.equals(-1L)){
            criteria.andIdEqualTo(orderId);
        }

        if(!orderType.equals(new Byte("-1"))){
            criteria.andOrderTypeEqualTo(orderType);
        }
        if(!payType.equals(new Byte("-1"))){
            criteria.andPayTypeEqualTo(payType);
        }
        if(!bussinessType.equals(new Byte("-1"))){
            criteria.andBussinessTypeEqualTo(bussinessType);
        }
        criteria.andOrderCreateTimeBetween(beginTime,endTime);
        if(!orderAction.equals(new Byte("-1"))){
            criteria.andOrderActionEqualTo(orderAction);
        }
        if(!orderStatus.equals(new Byte("-1"))){
            criteria.andOrderStatusEqualTo(orderStatus);
        }

        List<Order> orders = getBaseMapper().selectByExample(orderExample);
        orderAssetsService.init();


        List<OrderVo> orderVos = new ArrayList<>();

        orders.forEach(order -> {

            OrderVo orderVo = new OrderVo();
            try {
                BeanUtils.copyProperties(orderVo,order);
                orderVo.setBussinessType(orderAssetsService.switchBussinessType(orderVo.getBussinessType()));
                orderVo.setDeliveryType(orderAssetsService.switchDeliveryType(orderVo.getDeliveryType()));
                orderVo.setOrderAction(orderAssetsService.switchOrderAction(orderVo.getOrderAction()));
                orderVo.setOrderStatus(orderAssetsService.switchOrderStatus(orderVo.getOrderStatus()));
                orderVo.setOrderType(orderAssetsService.switchOrderType(orderVo.getOrderType()));
                orderVo.setPayType(orderAssetsService.switchPayType(orderVo.getPayType()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
//            System.out.println(orderVo);
            orderVos.add(orderVo);
        });




        String fileName = UUID.randomUUID().toString().replace("-","")+".xlsx";

        String link = "";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            out = TableService.writeExcel("订单信息表", orderVos, OrderVo.class);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] bytes = out.toByteArray();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);

        //返回文件链接给前端，让前端下载
        link = uploadService.uploadFile(fileName, in);


        return link;

    }
}
