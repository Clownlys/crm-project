package com.shangma.cn.controller;

import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.OrderGood;
import com.shangma.cn.service.OrderGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author clownly
 * @time 21:25
 */
@RestController
@RequestMapping("ordergood")
public class OrderGoodController extends BaseController<OrderGood,Long> {

    @Autowired
    private OrderGoodService orderGoodService;

    @GetMapping("goodoforder/{orderid}")
    public AxiosResult findByOrderId(@PathVariable Long orderid){
        List<OrderGood> byOrderId = orderGoodService.findByOrderId(orderid);
        return AxiosResult.success(byOrderId);
    }
}
