package com.shangma.cn.entity;


public class GoodsProduct {

    private String prodCode;

    private String prodName;

    private Long prodType;

    private Category category;

    private Long prodBrand;

    private Brand brand;

    private String prodModel;

    private String purchasingMode;

    private Boolean isShopGoods;

    private Boolean isStandby;

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

    public Boolean getShopGoods() {
        return isShopGoods;
    }

    public void setShopGoods(Boolean shopGoods) {
        isShopGoods = shopGoods;
    }

    public Boolean getStandby() {
        return isStandby;
    }

    public void setStandby(Boolean standby) {
        isStandby = standby;
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

    public Boolean getIsShopGoods() {
        return isShopGoods;
    }

    public void setIsShopGoods(Boolean isShopGoods) {
        this.isShopGoods = isShopGoods;
    }

    public Boolean getIsStandby() {
        return isStandby;
    }

    public void setIsStandby(Boolean isStandby) {
        this.isStandby = isStandby;
    }

}