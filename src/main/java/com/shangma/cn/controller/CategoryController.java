package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Category;
import com.shangma.cn.service.CategoryService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 开发者：辉哥
 * 特点： 辉哥很帅
 * 开发时间：2021/1/4 17:48
 * 文件说明：
 */
@RestController
@RequestMapping("category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("findNoPage")
    public AxiosResult<PageVo<Category>> findNoPage(){
        PageVo<Category> list=categoryService.findNoPage();
        return AxiosResult.success(list);
    }

    @GetMapping("getTreeData")
    public AxiosResult<List<Category>> getTreeData(@RequestParam(defaultValue = "-1")String categoryName){
        List<Category> list=categoryService.getTreeData(categoryName);
        return AxiosResult.success(list);
    }
    @GetMapping
    public AxiosResult<PageVo<Category>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize, @RequestParam(defaultValue = "-1")String categoryName) {
        PageHelper.startPage(currentPage, pageSize);
//        PageVo<Category> page = categoryService.findAll();
        PageVo<Category> page = categoryService.searchPage(categoryName);
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Category> findById(@PathVariable Long id) {
        return AxiosResult.success(categoryService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Category entity) {
        return toAxios(categoryService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Category entity) {
        return toAxios(categoryService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(categoryService.batchDeleteByIds(ids));
    }

}
