package com.shangma.cn.service.impl;


import com.shangma.cn.entity.orderassets.OrderAction;
import com.shangma.cn.entity.orderassets.OrderBussinessType;
import com.shangma.cn.mapper.orderassets.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author clownly
 * @create 2021-01-07 17:03
 */
@Service
@Transactional
public class OrderAssetsServiceImpl {

    @Autowired
    private OrderActionMapper orderActionMapper;

    @Autowired
    private OrderBussinessTypeMapper orderBussinessTypeMapper;

    @Autowired
    private OrderPayTypeMapper orderPayTypeMapper;

    @Autowired
    private OrderStatusMapper orderStatusMapper;

    @Autowired
    private OrderTypeMapper orderTypeMapper;

    @Autowired
    private OrderDeliveryTypeMapper orderDeliveryTypeMapper;

    public Map<String, Object> getOrderAssets(){
        HashMap<String, Object> map = new HashMap<>();

        map.put("orderActionList", orderActionMapper.selectByExample(null));
        map.put("bussinessTypeList", orderBussinessTypeMapper.selectByExample(null));
        map.put("payTypeList", orderPayTypeMapper.selectByExample(null));
        map.put("orderStatusList", orderStatusMapper.selectByExample(null));
        map.put("orderTypeList", orderTypeMapper.selectByExample(null));
        map.put("deliveryTypeList", orderDeliveryTypeMapper.selectByExample(null));
        return map;


    }
}
