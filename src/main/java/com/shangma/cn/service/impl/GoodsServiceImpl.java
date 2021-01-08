package com.shangma.cn.service.impl;

import com.shangma.cn.dto.SearchGoodsDto;
import com.shangma.cn.entity.Goods;
import com.shangma.cn.entity.GoodsExample;
import com.shangma.cn.entity.GoodsProduct;
import com.shangma.cn.entity.GoodsProductExample;
import com.shangma.cn.mapper.BrandMapper;
import com.shangma.cn.mapper.CategoryMapper;
import com.shangma.cn.mapper.GoodsMapper;
import com.shangma.cn.mapper.GoodsProductMapper;
import com.shangma.cn.service.GoodsService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods,Long> implements GoodsService {

    @Autowired
    private GoodsProductMapper goodsProductMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private BrandMapper brandMapper;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public PageVo<Goods> findPage(SearchGoodsDto searchGoodsDto) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if(searchGoodsDto.getGoodsName()!=null){
            criteria.andGoodsNameLike("%"+searchGoodsDto.getGoodsName()+"%");
        }
        GoodsProductExample goodsProductExample = new GoodsProductExample();
        GoodsProductExample.Criteria criteria1 = goodsProductExample.createCriteria();
        GoodsProduct goodsProduct = searchGoodsDto.getGoodsProduct();
        if(searchGoodsDto.getGoodsProduct().getProdModel()!=null){
            criteria1.andProdModelLike("%"+goodsProduct.getProdModel()+"%");
        }
        if(searchGoodsDto.getGoodsProduct().getProdBrand()!=null){
            criteria1.andProdBrandEqualTo(goodsProduct.getProdBrand());
        }
        if(searchGoodsDto.getGoodsProduct().getProdType()!=null){
            criteria1.andProdTypeEqualTo(goodsProduct.getProdType());
        }
        List<GoodsProduct> goodsProducts = goodsProductMapper.selectByExample(goodsProductExample);
        goodsProducts.forEach(item->{
            //给brand赋值
            item.setBrand(brandMapper.selectByPrimaryKey(item.getProdBrand()));
            //给category赋值
            item.setCategory(categoryMapper.selectByPrimaryKey(item.getProdType()));
        });
        if(searchGoodsDto.getGoodsColor()!=null){
            criteria.andGoodsColorLike("%"+searchGoodsDto.getGoodsColor()+"%");
        }
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);
        List<Goods> goodsList = new ArrayList<>();
        goods.forEach(good->{
            goodsProducts.forEach(item->{
                if(good.getProdId().equals(item.getId())){
                    good.setGoodsProduct(item);
                    goodsList.add(good);
                }
            });
        });
        return setPage(goodsList);
    }

    @Override
    public Goods findById(Long aLong) {
        Goods goods = goodsMapper.selectByPrimaryKey(aLong);
        GoodsProduct goodsProduct = goodsProductMapper.selectByPrimaryKey(goods.getProdId());
        goodsProduct.setBrand(brandMapper.selectByPrimaryKey(goodsProduct.getProdBrand()));
        goodsProduct.setCategory(categoryMapper.selectByPrimaryKey(goodsProduct.getProdType()));
        goods.setGoodsProduct(goodsProduct);
        return goods;
    }

    @Override
    public int addEntity(Goods entity) {
        return super.addEntity(entity);
    }

    @Override
    public int updateEntity(Goods entity) {
        return super.updateEntity(entity);
    }
}
