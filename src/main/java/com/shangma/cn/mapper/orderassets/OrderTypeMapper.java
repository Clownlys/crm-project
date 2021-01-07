package com.shangma.cn.mapper.orderassets;

import com.shangma.cn.entity.orderassets.OrderType;
import com.shangma.cn.entity.orderassets.OrderTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderTypeMapper {
    long countByExample(OrderTypeExample example);

    int deleteByExample(OrderTypeExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(OrderType record);

    int insertSelective(OrderType record);

    List<OrderType> selectByExample(OrderTypeExample example);

    OrderType selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") OrderType record, @Param("example") OrderTypeExample example);

    int updateByExample(@Param("record") OrderType record, @Param("example") OrderTypeExample example);

    int updateByPrimaryKeySelective(OrderType record);

    int updateByPrimaryKey(OrderType record);
}