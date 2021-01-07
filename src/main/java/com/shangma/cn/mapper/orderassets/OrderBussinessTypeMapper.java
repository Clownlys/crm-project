package com.shangma.cn.mapper.orderassets;

import com.shangma.cn.entity.orderassets.OrderBussinessType;
import com.shangma.cn.entity.orderassets.OrderBussinessTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderBussinessTypeMapper {
    long countByExample(OrderBussinessTypeExample example);

    int deleteByExample(OrderBussinessTypeExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(OrderBussinessType record);

    int insertSelective(OrderBussinessType record);

    List<OrderBussinessType> selectByExample(OrderBussinessTypeExample example);

    OrderBussinessType selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") OrderBussinessType record, @Param("example") OrderBussinessTypeExample example);

    int updateByExample(@Param("record") OrderBussinessType record, @Param("example") OrderBussinessTypeExample example);

    int updateByPrimaryKeySelective(OrderBussinessType record);

    int updateByPrimaryKey(OrderBussinessType record);
}