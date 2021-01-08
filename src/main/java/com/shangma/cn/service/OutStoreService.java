package com.shangma.cn.service;

import com.shangma.cn.dto.OutStoreSearchPageDto;
import com.shangma.cn.entity.OutGoodInfo;
import com.shangma.cn.entity.OutStore;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author:Mei
 * @create:2021-01-06 19:34
 */
public interface OutStoreService extends BaseService<OutStore, Long> {


    PageVo<OutStore> findPageByExample(OutStoreSearchPageDto outStoreSearchPageDto);


}
