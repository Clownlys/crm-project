package com.shangma.cn.service;

import com.shangma.cn.entity.Order;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

import java.util.Map;

/**
 * @author clownly
 * @time 20:33
 */
public interface OrderService extends BaseService<Order,Long> {

    PageVo<Order> findByCondition(Map<String,Object> condition);
}
