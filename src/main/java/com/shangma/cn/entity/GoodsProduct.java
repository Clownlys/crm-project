package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;

import java.util.Date;

public class GoodsProduct extends BaseEntity<Long> {
    private String prodCode;

    private String prodName;

    private Long prodType;

    private Category category;

    private Long prodBrand;

    private Brand brand;

    private String prodModel;

    private String purchasingMode;

    private Byte isShopGoods;

    private Byte isStandby;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public Long getProdType() {
        return prodType;
    }

    public void setProdType(Long prodType) {
        this.prodType = prodType;
    }

    public Long getProdBrand() {
        return prodBrand;
    }

    public void setProdBrand(Long prodBrand) {
        this.prodBrand = prodBrand;
    }

    public String getProdModel() {
        return prodModel;
    }

    public void setProdModel(String prodModel) {
        this.prodModel = prodModel == null ? null : prodModel.trim();
    }

    public String getPurchasingMode() {
        return purchasingMode;
    }

    public void setPurchasingMode(String purchasingMode) {
        this.purchasingMode = purchasingMode == null ? null : purchasingMode.trim();
    }

    public Byte getIsShopGoods() {
        return isShopGoods;
    }

    public void setIsShopGoods(Byte isShopGoods) {
        this.isShopGoods = isShopGoods;
    }

    public Byte getIsStandby() {
        return isStandby;
    }

    public void setIsStandby(Byte isStandby) {
        this.isStandby = isStandby;
    }

}