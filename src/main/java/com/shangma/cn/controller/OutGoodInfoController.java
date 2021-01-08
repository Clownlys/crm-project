package com.shangma.cn.controller;

import com.github.pagehelper.PageHelper;
import com.shangma.cn.common.http.AxiosResult;
import com.shangma.cn.controller.base.BaseController;
import com.shangma.cn.dto.OutGoodInfoDto;
import com.shangma.cn.dto.OutStoreSearchPageDto;
import com.shangma.cn.entity.OutGoodInfo;
import com.shangma.cn.entity.OutStore;
import com.shangma.cn.service.OutGoodInfoService;
import com.shangma.cn.service.OutStoreService;
import com.shangma.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:Mei
 * @create:2021-01-06 21:10
 */
@RestController
@RequestMapping("outGoodInfo")
public class OutGoodInfoController extends BaseController {

    @Autowired
    private OutGoodInfoService outGoodInfoService;

    @GetMapping
    public AxiosResult<PageVo<OutGoodInfo>> findPage(
            @RequestParam(defaultValue = "1") int currentPage,
            @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<OutGoodInfo> page = outGoodInfoService.findAll();
        return AxiosResult.success(page);
    }

    /**
     * 通过出库商品信息来查询所有的商品信息
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public AxiosResult<OutGoodInfo> findById(@PathVariable Long id) {
        return AxiosResult.success(outGoodInfoService.findById(id));
    }

    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody OutGoodInfo entity) {
        return toAxios(outGoodInfoService.addEntity(entity));
    }

    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody OutGoodInfo entity) {
        return toAxios(outGoodInfoService.updateEntity(entity));
    }

    @DeleteMapping("{ids}")
    public AxiosResult<Void> deleteById(@PathVariable List<Long> ids) {
        return toAxios(outGoodInfoService.batchDeleteByIds(ids));
    }

    /**
     * 根据商品出库单号来查询对应的商品信息
     * @param outStoreId
     * @return
     */
    @GetMapping("findByOutStoreId")
    public AxiosResult<List<OutGoodInfo>> findByOutStoreId(@RequestParam("outStoreId") Long outStoreId) {
        return AxiosResult.success(outGoodInfoService.findByOutStoreId(outStoreId));
    }

    /**
     * 出库商品信息按照不同条件进行查询
     * @param outGoodInfoDto
     * @param currentPage
     * @param pageSize
     * @return
     */
    @PostMapping("findPageByExample")
    public AxiosResult<PageVo<OutGoodInfo>> findPageByExample(
            @RequestBody OutGoodInfoDto outGoodInfoDto,
            @RequestParam(defaultValue = "1") int currentPage,
            @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<OutGoodInfo> page = outGoodInfoService.findPageByExample(outGoodInfoDto);
        return AxiosResult.success(page);
    }

}
