package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.Brand;
import com.shangma.cn.service.BrandService;
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
@RequestMapping("brand")
public class BrandController  extends BaseController {

    @Autowired
    private BrandService brandService;

    @GetMapping("findNoPage")
    public AxiosResult<PageVo<Brand>> findNoPage(){
        PageVo<Brand> page=brandService.findNoPage();
        return AxiosResult.success(page);
    }

//    @GetMapping
//    public AxiosResult<PageVo<Brand>> findPage(
//            @RequestParam(defaultValue = "1") int currentPage
//            , @RequestParam(defaultValue = "5") int pageSize) {
////        System.out.println(searchPageBrand);
//        PageHelper.startPage(currentPage, pageSize);
//        PageVo<Brand> page = brandService.findAll();
////        PageVo<Brand> page=brandService.searchPage(searchPageBrand);
//        return AxiosResult.success(page);
//    }

    @GetMapping
    public AxiosResult<PageVo<Brand>> searchPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize,
            @RequestParam(defaultValue = "-1") String brandName) {
        System.out.println(brandName);
        PageHelper.startPage(currentPage, pageSize);
        PageVo<Brand> page=brandService.searchPage(brandName);
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<Brand> findById(@PathVariable Long id) {
        return AxiosResult.success(brandService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Brand entity) {
        return toAxios(brandService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Brand entity) {
        return toAxios(brandService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(brandService.batchDeleteByIds(ids));
    }

}
