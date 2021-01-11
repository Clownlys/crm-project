package com.shangma.cn.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.file.UploadService;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.common.table.TableService;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Order;
import com.shangma.cn.entity.OrderExample;
import com.shangma.cn.entity.vo.OrderVo;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.service.impl.OrderAssetsServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author clownly
 * @time 20:15
 */
@RestController
@RequestMapping("order")
public class OrderController extends BaseController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderAssetsServiceImpl orderAssetsService;

    @Autowired
    private UploadService uploadService;

    @GetMapping("assets")
    public AxiosResult<Map<String, Object>> getOrderAssets() {

        orderAssetsService.init();
        return AxiosResult.success(orderAssetsService.getOrderAssets());
    }


    @GetMapping
    public AxiosResult<PageVo<Order>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize
            , @RequestParam(defaultValue = "-1", name = "orderId") Long orderId
            , @RequestParam(defaultValue = "-1", name = "orderType") Byte orderType
            , @RequestParam(defaultValue = "-1", name = "payType") Byte payType
            , @RequestParam(defaultValue = "-1", name = "bussinessType") Byte bussinessType
            , @RequestParam(defaultValue = "1970-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime
            , @RequestParam(defaultValue = "2070-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime
            , @RequestParam(defaultValue = "-1", name = "orderAction") Byte orderAction
            , @RequestParam(defaultValue = "-1", name = "orderStatus") Byte orderStatus
            , HttpServletRequest request) throws JsonProcessingException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);
        map.put("orderType", orderType);
        map.put("payType", payType);
        map.put("bussinessType", bussinessType);
        map.put("beginTime", beginTime);
        map.put("endTime", endTime);
        map.put("orderAction", orderAction);
        map.put("orderStatus", orderStatus);
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Order> page = orderService.findByCondition(map);


        return AxiosResult.success(page);
    }


    @GetMapping("{id}")
    public AxiosResult<Order> findById(@PathVariable Long id) {
        return AxiosResult.success(orderService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Order entity) {
        return toAxios(orderService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Order entity) {
        return toAxios(orderService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(orderService.batchDeleteByIds(ids));
    }

    @GetMapping("export")
    public AxiosResult<String> export(
//            @RequestParam(defaultValue = "1") int currentPage
//            , @RequestParam(defaultValue = "5") int pageSize
            @RequestParam(defaultValue = "-1", name = "orderId") Long orderId
            , @RequestParam(defaultValue = "-1", name = "orderType") Byte orderType
            , @RequestParam(defaultValue = "-1", name = "payType") Byte payType
            , @RequestParam(defaultValue = "-1", name = "bussinessType") Byte bussinessType
            , @RequestParam(defaultValue = "1970-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime
            , @RequestParam(defaultValue = "2070-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime
            , @RequestParam(defaultValue = "-1", name = "orderAction") Byte orderAction
            , @RequestParam(defaultValue = "-1", name = "orderStatus") Byte orderStatus
            , HttpServletResponse response) throws IOException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);
        map.put("orderType", orderType);
        map.put("payType", payType);
        map.put("bussinessType", bussinessType);
        map.put("beginTime", beginTime);
        map.put("endTime", endTime);
        map.put("orderAction", orderAction);
        map.put("orderStatus", orderStatus);
//        PageVo<Order> page = orderService.findByCondition(map);

        String link  = orderService.exportExcel(map);


        return AxiosResult.success(link);
    }



    @PostMapping("excel")
    public AxiosResult<Void> importExcel(@RequestParam("file") MultipartFile file,HttpServletRequest request) throws IOException, InstantiationException, IllegalAccessException {
        Enumeration<String> params = request.getParameterNames();
        while(params.hasMoreElements()){
            System.out.println(params.nextElement());
        }
        String originalFilename = file.getOriginalFilename();
        InputStream inputStream = file.getInputStream();
        List list = TableService.readExcel(inputStream, OrderVo.class);

        List<Order> orders = new ArrayList<>();

        list.forEach(item -> {

            OrderVo orderVo = (OrderVo) item;
            Order order = new Order();
            try {
                BeanUtils.copyProperties(order,orderVo);
                order.setBussinessType(orderAssetsService.switchBussinessType_(orderVo.getBussinessType()));
                order.setDeliveryType(orderAssetsService.switchDeliveryType_(orderVo.getDeliveryType()));
                order.setOrderAction(orderAssetsService.switchOrderAction_(orderVo.getOrderAction()));
                order.setOrderStatus(orderAssetsService.switchOrderStatus_(orderVo.getOrderStatus()));
                order.setOrderType(orderAssetsService.switchOrderType_(orderVo.getOrderType()));
                order.setPayType(orderAssetsService.switchPayType_(orderVo.getPayType()));

            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(order);
            orders.add(order);
        });


        return AxiosResult.success();

    }


}
