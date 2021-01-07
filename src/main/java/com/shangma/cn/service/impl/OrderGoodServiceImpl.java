package com.shangma.cn.service.impl;

import com.shangma.cn.entity.OrderGood;
import com.shangma.cn.entity.OrderGoodExample;
import com.shangma.cn.service.OrderGoodService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author clownly
 * @time 20:38
 */
@Service
@Transactional
public class OrderGoodServiceImpl extends BaseServiceImpl<OrderGood, Long> implements OrderGoodService {

    @Override
    public List<OrderGood> findByOrderId(Long orderId) {
        OrderGoodExample orderGoodExample = new OrderGoodExample();
        OrderGoodExample.Criteria criteria = orderGoodExample.createCriteria();
        criteria.andOrderIdEqualTo(orderId);
        List<OrderGood> orderGoods = getBaseMapper().selectByExample(orderGoodExample);

        return orderGoods;
    }
}
