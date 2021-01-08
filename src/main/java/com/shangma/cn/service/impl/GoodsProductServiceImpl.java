package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchGoodsProductDto;
import com.shangma.cn.entity.GoodsProduct;
import com.shangma.cn.entity.GoodsProductExample;
import com.shangma.cn.mapper.BrandMapper;
import com.shangma.cn.mapper.CategoryMapper;
import com.shangma.cn.mapper.GoodsProductMapper;
import com.shangma.cn.service.GoodsProductService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoodsProductServiceImpl extends BaseServiceImpl<GoodsProduct,Long> implements GoodsProductService {
    @Autowired
    private GoodsProductMapper goodsProductMapper;

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public PageVo<GoodsProduct> findPage(SearchGoodsProductDto searchGoodsProductDto) {
        GoodsProduct goodsProduct = new GoodsProduct();
        GoodsProductExample goodsProductExample = new GoodsProductExample();
        GoodsProductExample.Criteria criteria = goodsProductExample.createCriteria();
        if(searchGoodsProductDto.getProdCode()!=null){
            criteria.andProdCodeLike("%"+searchGoodsProductDto.getProdCode()+"%");
        }
        if(searchGoodsProductDto.getProdModel()!=null){
            criteria.andProdModelLike("%"+searchGoodsProductDto.getProdModel()+"%");
        }
        if (searchGoodsProductDto.getProdBrand()!=null){
            criteria.andProdBrandEqualTo(searchGoodsProductDto.getProdBrand());
        }
        if(searchGoodsProductDto.getProdType()!=null){
            criteria.andProdTypeEqualTo(searchGoodsProductDto.getProdType());
        }
        List<GoodsProduct> goodsProducts = goodsProductMapper.selectByExample(goodsProductExample);

        goodsProducts.forEach(item->{
            //给brand赋值
            item.setBrand(brandMapper.selectByPrimaryKey(item.getProdBrand()));
            //给category赋值
            item.setCategory(categoryMapper.selectByPrimaryKey(item.getProdType()));
        });

        PageVo<GoodsProduct> goodsProductPageVo = setPage(goodsProducts);
        return goodsProductPageVo;
    }

    @Override
    public PageVo<GoodsProduct> findNoPage() {
        List<GoodsProduct> goodsProducts = goodsProductMapper.selectByExample(null);
        goodsProducts.forEach(item->{
            //给brand赋值
            item.setBrand(brandMapper.selectByPrimaryKey(item.getProdBrand()));
            //给category赋值
            item.setCategory(categoryMapper.selectByPrimaryKey(item.getProdType()));
        });

        return setPage(goodsProducts);
    }

    @Override
    public GoodsProduct findById(Long aLong) {
        GoodsProduct goodsProduct = goodsProductMapper.selectByPrimaryKey(aLong);
        goodsProduct.setCategory(categoryMapper.selectByPrimaryKey(goodsProduct.getProdType()));
        goodsProduct.setBrand(brandMapper.selectByPrimaryKey(goodsProduct.getProdBrand()));
        return goodsProduct;
    }
}
