package com.shangma.cn.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.SearchGoodsProductDto;
import com.shangma.cn.entity.GoodsProduct;
import com.shangma.cn.service.GoodsProductService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JAVASM
 */
@RestController
@RequestMapping("goodsProduct")
public class GoodsProductController extends BaseController {
    @Autowired
    private GoodsProductService goodsProductService;


    @GetMapping("findNoPage")
    public AxiosResult<PageVo<GoodsProduct>> findNoPage(){
        PageVo<GoodsProduct> page=goodsProductService.findNoPage();
        return AxiosResult.success(page);
    }
    @PostMapping("findPage")
    public AxiosResult<PageVo<GoodsProduct>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize, @RequestBody(required = false)SearchGoodsProductDto searchGoodsProductDto) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<GoodsProduct> page = goodsProductService.findPage(searchGoodsProductDto);
        return AxiosResult.success(page);
    }

    @GetMapping("{id}")
    public AxiosResult<GoodsProduct> findById(@PathVariable Long id) {
        return AxiosResult.success(goodsProductService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody GoodsProduct entity) {
        return toAxios(goodsProductService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody GoodsProduct entity) {
        return toAxios(goodsProductService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(goodsProductService.batchDeleteByIds(ids));
    }
}
