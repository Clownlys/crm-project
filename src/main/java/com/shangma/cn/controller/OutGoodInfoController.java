package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.entity.OutStore;
import com.shangma.cn.service.OutStoreService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:Mei
 * @create:2021-01-06 21:10
 */
public class OutGoodInfoController extends BaseController {

    @Autowired
    private OutStoreService outStoreService;

    @GetMapping
    public AxiosResult<PageVo<OutStore>> findPage(
            @RequestParam(defaultValue = "1") int currentPage
            , @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<OutStore> page = outStoreService.findAll();
        return AxiosResult.success(page);


    }



    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody OutStore entity) {
        return toAxios(outStoreService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody OutStore entity) {
        return toAxios(outStoreService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(outStoreService.batchDeleteByIds(ids));
    }

    @GetMapping("{outStoreId}")
    public AxiosResult<OutStore> findById(@PathVariable Long outStoreId) {
        return AxiosResult.success(outStoreService.findById(outStoreId));
    }
}
