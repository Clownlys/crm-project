package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class OutGoodInfo extends BaseEntity<Long> {
    private Long outStoreId;

    private String goodBrand;

    private String goodName;

    /*商品型号*/
    private String goodModel;

    private String goodColor;

    private String goodSupplier;

    private String goodTraceMessage;

    private String returnFactoryConfig;

    private String goodApparentStatus;

    @Override
    public String toString() {
        return "OutGoodInfo{" +
                "outStoreId=" + outStoreId +
                ", goodBrand='" + goodBrand + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodModel='" + goodModel + '\'' +
                ", goodColor='" + goodColor + '\'' +
                ", goodSupplier='" + goodSupplier + '\'' +
                ", goodTraceMessage='" + goodTraceMessage + '\'' +
                ", returnFactoryConfig='" + returnFactoryConfig + '\'' +
                ", goodApparentStatus='" + goodApparentStatus + '\'' +
                '}';
    }
}