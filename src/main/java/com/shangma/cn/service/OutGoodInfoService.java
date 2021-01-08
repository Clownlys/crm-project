package com.shangma.cn.service;

import com.shangma.cn.dto.OutGoodInfoDto;
import com.shangma.cn.entity.OutGoodInfo;
import com.shangma.cn.entity.OutStore;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

import java.util.List;

/**
 * @author:Mei
 * @create:2021-01-06 19:43
 */
public interface OutGoodInfoService extends BaseService<OutGoodInfo,Long> {

    List<OutGoodInfo> findByOutStoreId(Long outStoreId);

    PageVo<OutGoodInfo> findPageByExample(OutGoodInfoDto outGoodInfoDto);
}
