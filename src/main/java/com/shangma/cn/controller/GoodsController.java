package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.SearchGoodsDto;
import com.shangma.cn.entity.Goods;
import com.shangma.cn.service.GoodsService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping("findPage")
    public AxiosResult<PageVo<Goods>> findPage(@RequestBody(required = false) SearchGoodsDto searchGoodsDto) {
        PageVo<Goods> page = goodsService.findPage(searchGoodsDto);
        return AxiosResult.success(page);
    }


    @GetMapping("{id}")
    public AxiosResult<Goods> findById(@PathVariable Long id) {
        return AxiosResult.success(goodsService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody Goods entity) {
        return toAxios(goodsService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody Goods entity) {
        return toAxios(goodsService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(goodsService.batchDeleteByIds(ids));
    }

}
