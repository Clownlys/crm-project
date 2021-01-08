package com.shangma.cn.service;

import com.shangma.cn.dto.SearchGoodsDto;
import com.shangma.cn.entity.Goods;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * 商品
 * @author JAVASM
 */
public interface GoodsService extends BaseService<Goods,Long> {

    PageVo<Goods> findPage(SearchGoodsDto searchGoodsDto);
}
