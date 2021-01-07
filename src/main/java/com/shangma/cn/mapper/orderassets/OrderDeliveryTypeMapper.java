package com.shangma.cn.mapper.orderassets;

import com.shangma.cn.entity.orderassets.OrderDeliveryType;
import com.shangma.cn.entity.orderassets.OrderDeliveryTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDeliveryTypeMapper {
    long countByExample(OrderDeliveryTypeExample example);

    int deleteByExample(OrderDeliveryTypeExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(OrderDeliveryType record);

    int insertSelective(OrderDeliveryType record);

    List<OrderDeliveryType> selectByExample(OrderDeliveryTypeExample example);

    OrderDeliveryType selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") OrderDeliveryType record, @Param("example") OrderDeliveryTypeExample example);

    int updateByExample(@Param("record") OrderDeliveryType record, @Param("example") OrderDeliveryTypeExample example);

    int updateByPrimaryKeySelective(OrderDeliveryType record);

    int updateByPrimaryKey(OrderDeliveryType record);
}