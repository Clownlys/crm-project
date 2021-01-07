package com.shangma.cn.mapper.orderassets;

import com.shangma.cn.entity.orderassets.OrderAction;
import com.shangma.cn.entity.orderassets.OrderActionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderActionMapper {
    long countByExample(OrderActionExample example);

    int deleteByExample(OrderActionExample example);

    int deleteByPrimaryKey(Byte id);

    int insert(OrderAction record);

    int insertSelective(OrderAction record);

    List<OrderAction> selectByExample(OrderActionExample example);

    OrderAction selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") OrderAction record, @Param("example") OrderActionExample example);

    int updateByExample(@Param("record") OrderAction record, @Param("example") OrderActionExample example);

    int updateByPrimaryKeySelective(OrderAction record);

    int updateByPrimaryKey(OrderAction record);
}