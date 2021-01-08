package com.shangma.cn.service.impl;

import com.shangma.cn.entity.Brand;
import com.shangma.cn.entity.BrandExample;
import com.shangma.cn.mapper.BrandMapper;
import com.shangma.cn.service.BrandService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand,Long> implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Override
    public PageVo<Brand> searchPage(String brandName) {
        BrandExample brandExample = new BrandExample();
        BrandExample.Criteria criteria = brandExample.createCriteria();
        if(brandExample!=null&!"-1".equals(brandName)){
            criteria.andBrandNameLike("%"+brandName+"%");
        }
        List<Brand> brands = brandMapper.selectByExample(brandExample);
        PageVo<Brand> brandPageVo = setPage(brands);
        return brandPageVo;
    }

    @Override
    public PageVo<Brand> findNoPage() {
        List<Brand> brands = brandMapper.selectByExample(null);
        return setPage(brands);
    }
}
