package com.shangma.cn.mapper;

import com.shangma.cn.entity.InStore;
import com.shangma.cn.entity.InStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InStoreMapper {
    long countByExample(InStoreExample example);

    int deleteByExample(InStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InStore record);

    int insertSelective(InStore record);

    List<InStore> selectByExample(InStoreExample example);

    InStore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InStore record, @Param("example") InStoreExample example);

    int updateByExample(@Param("record") InStore record, @Param("example") InStoreExample example);

    int updateByPrimaryKeySelective(InStore record);

    int updateByPrimaryKey(InStore record);
}