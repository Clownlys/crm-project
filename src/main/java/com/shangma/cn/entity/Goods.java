package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

public class Goods extends BaseEntity<Long> {

    private String goodsName;

    private Long prodId;

    private GoodsProduct goodsProduct;

    private String goodsColor;

    private double purchasingPrice;

    private double marketPrice;

    private double mallPrice;

    private Long goodsStock;

    private Byte goodsStatus;


    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public GoodsProduct getGoodsProduct() {
        return goodsProduct;
    }

    public void setGoodsProduct(GoodsProduct goodsProduct) {
        this.goodsProduct = goodsProduct;
    }

    public double getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public double getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(double mallPrice) {
        this.mallPrice = mallPrice;
    }

    public Long getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Long goodsStock) {
        this.goodsStock = goodsStock;
    }

    public Byte getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Byte goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

}