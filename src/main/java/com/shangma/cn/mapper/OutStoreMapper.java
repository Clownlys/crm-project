package com.shangma.cn.mapper;

import com.shangma.cn.entity.OutStore;
import com.shangma.cn.entity.OutStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OutStoreMapper {
    long countByExample(OutStoreExample example);

    int deleteByExample(OutStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OutStore record);

    int insertSelective(OutStore record);

    List<OutStore> selectByExample(OutStoreExample example);

    OutStore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OutStore record, @Param("example") OutStoreExample example);

    int updateByExample(@Param("record") OutStore record, @Param("example") OutStoreExample example);

    int updateByPrimaryKeySelective(OutStore record);

    int updateByPrimaryKey(OutStore record);
}