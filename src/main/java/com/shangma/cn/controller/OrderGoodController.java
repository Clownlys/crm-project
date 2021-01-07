package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.OrderGood;


import com.shangma.cn.service.OrderGoodService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author clownly
 * @time 21:25
 */
@RestController
@RequestMapping("ordergood")
public class OrderGoodController extends BaseController {

    @Autowired
    private OrderGoodService orderGoodService;

    @GetMapping("orderid/{orderId}")
    public AxiosResult findByOrderGoodId(@PathVariable Long orderId){
        List<OrderGood> byOrderGoodId = orderGoodService.findByOrderId(orderId);
        return AxiosResult.success(byOrderGoodId);
    }



    @GetMapping
    public AxiosResult<PageVo<OrderGood>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<OrderGood> page = orderGoodService.findAll();
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<OrderGood> findById(@PathVariable Long id) {
        return AxiosResult.success(orderGoodService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody OrderGood entity) {
        return toAxios(orderGoodService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody OrderGood entity) {
        return toAxios(orderGoodService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(orderGoodService.batchDeleteByIds(ids));
    }

}
