package com.shangma.cn.service;

import com.shangma.cn.entity.Category;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.base.BaseService;

import java.util.List;

/**
 * @author JAVASM
 */
public interface CategoryService extends BaseService<Category,Long> {
    List<Category> getTreeData();
}
