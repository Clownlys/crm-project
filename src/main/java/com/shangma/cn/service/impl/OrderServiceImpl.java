package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Order;
import com.shangma.cn.entity.OrderExample;
import com.shangma.cn.mapper.base.BaseMapper;
import com.shangma.cn.service.OrderService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;

/**
 * @author clownly
 * @time 20:34
 */
@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<Order, Long> implements OrderService {


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
}
