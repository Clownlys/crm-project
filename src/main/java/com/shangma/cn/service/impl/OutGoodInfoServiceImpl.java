package com.shangma.cn.service.impl;

import com.shangma.cn.dto.OutGoodInfoDto;
import com.shangma.cn.entity.OutGoodInfo;
import com.shangma.cn.entity.OutGoodInfoExample;
import com.shangma.cn.mapper.OutGoodInfoMapper;
import com.shangma.cn.service.OutGoodInfoService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:Mei
 * @create:2021-01-06 19:49
 */
@Service
@Transactional
public class OutGoodInfoServiceImpl extends BaseServiceImpl<OutGoodInfo,Long> implements OutGoodInfoService {
    @Autowired
    private OutGoodInfoMapper outGoodInfoMapper;

    @Override
    public List<OutGoodInfo> findByOutStoreId(Long outStoreId) {
        OutGoodInfoExample outGoodInfoExample = new OutGoodInfoExample();
        OutGoodInfoExample.Criteria criteria = outGoodInfoExample.createCriteria();
        if (outStoreId != null) {
            criteria.andOutStoreIdEqualTo(outStoreId);
        }
        List<OutGoodInfo> outGoodInfos = outGoodInfoMapper.selectByExample(outGoodInfoExample);
        return outGoodInfos;
    }

    @Override
    public PageVo<OutGoodInfo> findPageByExample(OutGoodInfoDto outGoodInfoDto) {
        OutGoodInfoExample outGoodInfoExample = new OutGoodInfoExample();
        OutGoodInfoExample.Criteria criteria = outGoodInfoExample.createCriteria();

        if (outGoodInfoDto.getId() != null) {
            criteria.andIdEqualTo(outGoodInfoDto.getId());
        }

        if (outGoodInfoDto.getGoodBrand() != null) {
            criteria.andGoodBrandLike("%"+ outGoodInfoDto.getGoodBrand()+ "%");
        }

        if (outGoodInfoDto.getGoodName() != null) {
            criteria.andGoodNameLike("%"+outGoodInfoDto.getGoodName()+"%");
        }

        if (outGoodInfoDto.getGoodModel() != null) {
            criteria.andGoodModelLike("%"+outGoodInfoDto.getGoodModel()+ "%");
        }

        if (outGoodInfoDto.getGoodColor() != null) {
            criteria.andGoodColorLike("%"+outGoodInfoDto.getGoodColor()+ "%");
        }

        if (outGoodInfoDto.getGoodSupplier() != null) {
            criteria.andGoodSupplierLike("%" +outGoodInfoDto.getGoodSupplier() + "%");
        }

        List<OutGoodInfo> outGoodInfos = outGoodInfoMapper.selectByExample(outGoodInfoExample);
        PageVo<OutGoodInfo> outGoodInfoPageVo = setPage(outGoodInfos);
        return outGoodInfoPageVo;

    }
}
