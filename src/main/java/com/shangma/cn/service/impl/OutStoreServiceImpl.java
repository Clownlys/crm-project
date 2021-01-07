package com.shangma.cn.service.impl;

import com.shangma.cn.dto.OutStoreSearchPageDto;
import com.shangma.cn.entity.OutStore;
import com.shangma.cn.entity.OutStoreExample;
import com.shangma.cn.mapper.OutStoreMapper;
import com.shangma.cn.service.OutStoreService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * @author:Mei
 * @create:2021-01-06 19:46
 */
@Service
@Transactional
public class OutStoreServiceImpl extends BaseServiceImpl<OutStore,Long> implements OutStoreService {

    @Autowired
    private OutStoreMapper outStoreMapper;

    @Override
    public PageVo<OutStore> findPageByExample(OutStoreSearchPageDto outStoreSearchPageDto) {
        OutStoreExample outStoreExample = new OutStoreExample();
        OutStoreExample.Criteria criteria = outStoreExample.createCriteria();

        if(outStoreSearchPageDto.getId() != null) {
            criteria.andIdEqualTo(outStoreSearchPageDto.getId());
        }

        if(outStoreSearchPageDto.getReturnOutStoreFlag() != null) {
            criteria.andReturnOutStoreFlagEqualTo(outStoreSearchPageDto.getReturnOutStoreFlag());
        }

        if(outStoreSearchPageDto.getApprovalStatus() != null) {
            criteria.andApprovalStatusEqualTo(outStoreSearchPageDto.getApprovalStatus());
        }

        if (outStoreSearchPageDto.getDocumentMaker() != null) {
            criteria.andDocumentMakerEqualTo(outStoreSearchPageDto.getDocumentMaker());
        }

        if (outStoreSearchPageDto.getMakingTime1() != null && outStoreSearchPageDto.getMakingTime2() != null) {
            criteria.andMakingTimeBetween(outStoreSearchPageDto.getMakingTime1(),outStoreSearchPageDto.getMakingTime2());
        }

        if (outStoreSearchPageDto.getApprovalTime1() != null && outStoreSearchPageDto.getApprovalTime2() !=null) {
            criteria.andApprovalTimeBetween(outStoreSearchPageDto.getApprovalTime1(),outStoreSearchPageDto.getApprovalTime2());
        }
        return setPage(outStoreMapper.selectByExample(outStoreExample));
    }
}
