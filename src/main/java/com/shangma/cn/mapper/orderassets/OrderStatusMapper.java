package com.shangma.cn.mapper.orderassets;

import com.shangma.cn.entity.orderassets.OrderStatus;
import com.shangma.cn.entity.orderassets.OrderStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderStatusMapper {
    long countByExample(OrderStatusExample example);

    int deleteByExample(OrderStatusExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    List<OrderStatus> selectByExample(OrderStatusExample example);

    OrderStatus selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}