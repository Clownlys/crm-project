package com.shangma.cn.service;


import com.shangma.cn.entity.Category;
import com.shangma.cn.entity.Supplier;
import com.shangma.cn.service.base.BaseService;
import com.shangma.cn.vo.PageVo;

import java.util.List;

/**
 * @author JAVASM
 */
public interface CategoryService extends BaseService<Category,Long> {
    List<Category> getTreeData(String categoryName);

    PageVo<Category> searchPage(String categoryName);

    PageVo<Category> findNoPage();

}
