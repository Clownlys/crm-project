package com.shangma.cn.mapper;

import com.shangma.cn.entity.InGoodInfo;
import com.shangma.cn.entity.InGoodInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InGoodInfoMapper {
    long countByExample(InGoodInfoExample example);

    int deleteByExample(InGoodInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InGoodInfo record);

    int insertSelective(InGoodInfo record);

    List<InGoodInfo> selectByExample(InGoodInfoExample example);

    InGoodInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InGoodInfo record, @Param("example") InGoodInfoExample example);

    int updateByExample(@Param("record") InGoodInfo record, @Param("example") InGoodInfoExample example);

    int updateByPrimaryKeySelective(InGoodInfo record);

    int updateByPrimaryKey(InGoodInfo record);
}