package com.shangma.cn.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Order;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.service.impl.OrderAssetsServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    private   OrderAssetsServiceImpl orderAssetsService;

    @GetMapping("assets")
    public AxiosResult<Map<String,Object>> getOrderAssets(){

        return AxiosResult.success(orderAssetsService.getOrderAssets());
    }

    @GetMapping
    public AxiosResult<PageVo<Order>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize
            , @RequestParam(defaultValue = "-1",name = "orderId") Long orderId
            , @RequestParam(defaultValue = "-1",name = "orderType") Byte orderType
            , @RequestParam(defaultValue = "-1",name = "payType") Byte payType
            , @RequestParam(defaultValue = "-1",name = "bussinessType") Byte bussinessType
            , @RequestParam(defaultValue = "1970-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd") Date beginTime
            , @RequestParam(defaultValue = "2070-01-01") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endTime
            , @RequestParam(defaultValue = "-1",name = "orderAction") Byte orderAction
            , @RequestParam(defaultValue = "-1",name = "orderStatus") Byte orderStatus
    , HttpServletRequest request) throws JsonProcessingException {
//        System.out.println("currentPage:"+currentPage);
//        System.out.println("pageSize:"+pageSize);
//        System.out.println("orderId:"+orderId);
//        System.out.println("orderType:"+orderType);
//        System.out.println("payType:"+payType);
//        System.out.println("bussinessType:"+bussinessType);
//        System.out.println("beginTime:"+beginTime);
//        System.out.println("endTime:"+endTime);
//        System.out.println("orderAction:"+orderAction);
//        System.out.println("orderStatus:"+orderStatus);
        HashMap<String, Object> map = new HashMap<>();
        map.put("orderId", orderId);
        map.put("orderType", orderType);
        map.put("payType", payType);
        map.put("bussinessType",bussinessType);
        map.put("beginTime",beginTime);
        map.put("endTime",endTime);
        map.put("orderAction",orderAction);
        map.put("orderStatus",orderStatus);

        PageHelper.startPage(currentPage, pageSize);
//        PageVo<Order> page = orderService.findAll();
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





}
