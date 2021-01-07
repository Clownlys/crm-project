package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchSuppilerDto;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.entity.SupplierExample;
import com.shangma.cn.mapper.SupplierMapper;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author JAVASM
 */
@Service
@Transactional
public class SupplierServiceImpl extends BaseServiceImpl<Supplier,Long> implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public PageVo<Supplier> findPage(SearchSuppilerDto searchSuppilerDto) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        if(searchSuppilerDto.getSupplierName()!=null){
            criteria.andSupplierNameLike("%"+searchSuppilerDto.getSupplierName()+"%");
        }
        if(searchSuppilerDto.getSupplierContact()!=null){
            criteria.andSupplierContactLike("%"+searchSuppilerDto.getSupplierContact()+"%");
        }
        if(searchSuppilerDto.getSupplierPhone()!=null){
            criteria.andSupplierPhoneLike("%"+searchSuppilerDto.getSupplierPhone()+"%");
        }
        if(searchSuppilerDto.getSupplierAddress()!=null){
            criteria.andSupplierAddressLike("%"+searchSuppilerDto.getSupplierAddress()+"%");
        }
        if(searchSuppilerDto.getSupplierBrank()!=null){
            criteria.andSupplierBrankLike("%"+searchSuppilerDto.getSupplierBrank()+"%");
        }
        if(searchSuppilerDto.getSupplierBrankCode()!=null){
            criteria.andSupplierBrankCodeLike("%"+searchSuppilerDto.getSupplierBrankCode()+"%");
        }
        List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);
        PageVo<Supplier> supplierPageVo = setPage(suppliers);
        return supplierPageVo;
    }
}
