package com.shangma.cn.service;

import com.shangma.cn.dto.SearchGoodsProductDto;
import com.shangma.cn.entity.GoodsProduct;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * 产品
 * @author JAVASM
 */
public interface GoodsProductService extends BaseService<GoodsProduct,Long> {
    PageVo<GoodsProduct> findPage(SearchGoodsProductDto searchGoodsProductDto);

    PageVo<GoodsProduct> findNoPage();

}
