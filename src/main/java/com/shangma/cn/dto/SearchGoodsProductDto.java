package com.shangma.cn.dto;

import lombok.Data;

@Data
public class SearchGoodsProductDto {
    private String prodCode;
    private String prodModel;
    private Long prodBrand;
    private Long prodType;
}
