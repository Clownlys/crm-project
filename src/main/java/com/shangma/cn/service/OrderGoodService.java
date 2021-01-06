package com.shangma.cn.service;

import com.shangma.cn.entity.OrderGood;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

/**
 * @author clownly
 * @time 20:37
 */
public interface OrderGoodService extends BaseService<OrderGood,Long> {


    List<OrderGood> findByOrderId(Long orderId);
}
