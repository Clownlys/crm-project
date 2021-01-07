package com.shangma.cn.service.impl;


import com.shangma.cn.entity.Category;
import com.shangma.cn.entity.CategoryExample;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.mapper.CategoryMapper;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.service.SupplierService;
import com.shangma.cn.service.base.impl.BaseServiceImpl;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author JAVASM
 */
@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category,Long> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getTreeData(String categoryName) {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        if(categoryName!=null&&!"-1".equals(categoryName)){
            criteria.andCategoryDescLike("%"+categoryName+"%");
        }
        //查询所有
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        //过滤出来一级数据
        List<Category> root = categories.stream().filter(category -> category.getParentId().equals(0L)).collect(Collectors.toList());
        root.forEach(item->{
            getChildren(categories,item);
        });

        return root;
    }

    @Override
    public PageVo<Category> searchPage(String categoryName) {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        if(categoryName!=null&&!"-1".equals(categoryName)){
            criteria.andCategoryDescLike("%"+categoryName+"%");
        }
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        PageVo<Category> categoryPageVo = setPage(categories);
        return categoryPageVo;
    }

    public void getChildren(List<Category> categories,Category category){
        List<Category> childrenList = categories.stream().filter(category1 -> category1.getParentId().equals(category.getId())).collect(Collectors.toList());
        if(childrenList.size()>0){
            category.setChildren(childrenList);
            childrenList.forEach(item->{
                getChildren(categories,item);
            });
        }
    }
}
