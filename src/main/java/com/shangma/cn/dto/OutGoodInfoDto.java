package com.shangma.cn.dto;

import lombok.Data;

/**
 * @author:Mei
 * @create:2021-01-08 10:04
 */
@Data
public class OutGoodInfoDto {
    /*商品串号*/
    private Long id;

    private String goodBrand;

    private String goodName;

    /*商品型号*/
    private String goodModel;

    private String goodColor;

    private String goodSupplier;

    public OutGoodInfoDto() {
    }

    public OutGoodInfoDto(Long id, String goodBrand, String goodName, String goodModel, String goodColor, String goodSupplier) {
        this.id = id;
        this.goodBrand = goodBrand;
        this.goodName = goodName;
        this.goodModel = goodModel;
        this.goodColor = goodColor;
        this.goodSupplier = goodSupplier;
    }

    @Override
    public String toString() {
        return "OutGoodInfoDto{" +
                "id=" + id +
                ", goodBrand='" + goodBrand + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodModel='" + goodModel + '\'' +
                ", goodColor='" + goodColor + '\'' +
                ", goodSupplier='" + goodSupplier + '\'' +
                '}';
    }
}
