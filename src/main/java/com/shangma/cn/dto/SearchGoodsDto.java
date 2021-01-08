package com.shangma.cn.dto;

import com.shangma.cn.entity.GoodsProduct;
import lombok.Data;

@Data
public class SearchGoodsDto {

    private String goodsName;
    private GoodsProduct goodsProduct;
    private String goodsColor;
}
