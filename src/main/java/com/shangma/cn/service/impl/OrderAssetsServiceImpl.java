package com.shangma.cn.service.impl;


import com.shangma.cn.entity.orderassets.*;
import com.shangma.cn.mapper.orderassets.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author clownly
 * @create 2021-01-07 17:03
 */
@Component
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



    private Map<String,Object> map;

    private List<OrderAction> orderActions;
    private List<OrderBussinessType> orderBussinessTypes;
    private List<OrderPayType> orderPayTypes;
    private List<OrderStatus> orderStatuses;
    private List<OrderType> orderTypes;
    private List<OrderDeliveryType> orderDeliveryTypes;



    public void init(){
        if(this.map!=null){
            return;
        }
        this.map = new HashMap<>();
        System.out.println("加载OrderAssetsService构造函数");
        this.orderActions = orderActionMapper.selectByExample(null);
        this.orderBussinessTypes = orderBussinessTypeMapper.selectByExample(null);
        this.orderPayTypes = orderPayTypeMapper.selectByExample(null);
        this.orderStatuses = orderStatusMapper.selectByExample(null);
        this.orderTypes = orderTypeMapper.selectByExample(null);
        this.orderDeliveryTypes = orderDeliveryTypeMapper.selectByExample(null);
        System.out.println("orderAssetsList初始化完成");
        this.map.put("orderActionList", this.orderActions);
        this.map.put("bussinessTypeList",  this.orderBussinessTypes);
        this.map.put("payTypeList", this.orderPayTypes);
        this.map.put("orderStatusList", this.orderStatuses);
        this.map.put("orderTypeList", this.orderTypes);
        this.map.put("deliveryTypeList", this.orderDeliveryTypes);
        System.out.println("orderAssetsMap初始化完成");
    }

    public Map<String, Object> getOrderAssets(){
//        HashMap<String, Object> map = new HashMap<>();
        return this.map;
    }

    public String switchBussinessType(String id){
        String name = "无";
        OrderBussinessType item;
        for (int i = 0; i < this.orderBussinessTypes.size(); i++) {
            item = this.orderBussinessTypes.get(i);
            if(item.getId().equals(new Byte(id))){
                name = item.getName();
                return name;
            }
        }

        return name;
    }

    public Byte switchBussinessType_(String name){
        Byte aByte= null;
        OrderBussinessType item;
        for (int i = 0; i < this.orderBussinessTypes.size(); i++) {
            item = this.orderBussinessTypes.get(i);
            if(item.getName().equals(name)){
                aByte = item.getId();
                return aByte;
            }
        }

        return aByte;
    }


    public String switchOrderType(String id){
        String name = "无";
        OrderType item;
        for (int i = 0; i < this.orderTypes.size(); i++) {
            item = this.orderTypes.get(i);
            if(item.getId().equals(new Byte(id))){
                name = item.getName();
                return name;
            }
        }

        return name;
    }

    public Byte switchOrderType_(String name){
        Byte aByte= null;
        OrderType item;
        for (int i = 0; i < this.orderTypes.size(); i++) {
            item = this.orderTypes.get(i);
            if(item.getName().equals(name)){
                aByte = item.getId();
                return aByte;
            }
        }

        return aByte;
    }
    public String switchOrderAction(String id){
        String name = "无";
        OrderAction item;
        for (int i = 0; i < this.orderActions.size(); i++) {
            item = this.orderActions.get(i);
            if(item.getId().equals(new Byte(id))){
                name = item.getName();
                return name;
            }
        }

        return name;
    }
    public Byte switchOrderAction_(String name){
        Byte aByte= null;
        OrderAction item;
        for (int i = 0; i < this.orderActions.size(); i++) {
            item = this.orderActions.get(i);
            if(item.getName().equals(name)){
                aByte = item.getId();
                return aByte;
            }
        }

        return aByte;
    }
    public String switchOrderStatus(String id){
        String name = "无";
        OrderStatus item;
        for (int i = 0; i < this.orderStatuses.size(); i++) {
            item = this.orderStatuses.get(i);
            if(item.getId().equals(new Byte(id))){
                name = item.getName();
                return name;
            }
        }

        return name;
    }
    public Byte switchOrderStatus_(String name){
        Byte aByte= null;
        OrderStatus item;
        for (int i = 0; i < this.orderStatuses.size(); i++) {
            item = this.orderStatuses.get(i);
            if(item.getName().equals(name)){
                aByte = item.getId();
                return aByte;
            }
        }

        return aByte;
    }

    public String switchDeliveryType(String id){
        String name = "无";
        OrderDeliveryType item;
        for (int i = 0; i < this.orderDeliveryTypes.size(); i++) {
            item = this.orderDeliveryTypes.get(i);
            if(item.getId().equals(new Byte(id))){
                name = item.getName();
                return name;
            }
        }
        return name;
    }
    public Byte switchDeliveryType_(String name){
        Byte aByte= null;
        OrderDeliveryType item;
        for (int i = 0; i < this.orderDeliveryTypes.size(); i++) {
            item = this.orderDeliveryTypes.get(i);
            if(item.getName().equals(name)){
                aByte = item.getId();
                return aByte;
            }
        }

        return aByte;
    }
    public String switchPayType(String id){


        String name = "无";
        OrderPayType item;
        for (int i = 0; i < this.orderPayTypes.size(); i++) {
            item = this.orderPayTypes.get(i);
            if(item.getId().equals(new Byte(id))){
                name = item.getName();
                return name;
            }
        }
        return name;
    }
    public Byte switchPayType_(String name){
        Byte aByte= null;
        OrderPayType item;
        for (int i = 0; i < this.orderPayTypes.size(); i++) {
            item = this.orderPayTypes.get(i);
            if(item.getName().equals(name)){
                aByte = item.getId();
                return aByte;
            }
        }

        return aByte;
    }




}
