package com.shangma.cn.mapper.orderassets;

import com.shangma.cn.entity.orderassets.OrderPayType;
import com.shangma.cn.entity.orderassets.OrderPayTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderPayTypeMapper {
    long countByExample(OrderPayTypeExample example);

    int deleteByExample(OrderPayTypeExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(OrderPayType record);

    int insertSelective(OrderPayType record);

    List<OrderPayType> selectByExample(OrderPayTypeExample example);

    OrderPayType selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") OrderPayType record, @Param("example") OrderPayTypeExample example);

    int updateByExample(@Param("record") OrderPayType record, @Param("example") OrderPayTypeExample example);

    int updateByPrimaryKeySelective(OrderPayType record);

    int updateByPrimaryKey(OrderPayType record);
}