package com.shangma.cn.service;

import com.shangma.cn.dto.SearchSuppilerDto;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

/**
 * @author JAVASM
 */
public interface SupplierService extends BaseService<Supplier,Long> {
    PageVo<Supplier> findPage(SearchSuppilerDto searchSuppilerDto);
}
