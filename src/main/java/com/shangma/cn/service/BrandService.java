package com.shangma.cn.service;

import com.shangma.cn.entity.Brand;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * 开发者：辉哥
 * 特点： 辉哥很帅
 * 开发时间：2021/1/4 17:37
 * 文件说明：
 */
public interface BrandService  extends BaseService<Brand,Long> {
    PageVo<Brand> searchPage(String brandName);

    PageVo<Brand> findNoPage();

}
