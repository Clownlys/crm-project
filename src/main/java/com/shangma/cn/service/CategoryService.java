package com.shangma.cn.service;

import com.shangma.cn.entity.Category;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

/**
 * @author:Mei
 * @create:2021-01-07 10:28
 */
public interface CategoryService extends BaseService<Category,Long> {

    List<Category> getTreeData();
}
