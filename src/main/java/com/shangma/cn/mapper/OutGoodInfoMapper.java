package com.shangma.cn.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutGoodInfoMapper {
    long countByExample(OutGoodInfoExample example);

    int deleteByExample(OutGoodInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OutGoodInfo record);

    int insertSelective(OutGoodInfo record);

    List<OutGoodInfo> selectByExample(OutGoodInfoExample example);

    OutGoodInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OutGoodInfo record, @Param("example") OutGoodInfoExample example);

    int updateByExample(@Param("record") OutGoodInfo record, @Param("example") OutGoodInfoExample example);

    int updateByPrimaryKeySelective(OutGoodInfo record);

    int updateByPrimaryKey(OutGoodInfo record);
}