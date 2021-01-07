package com.shangma.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class OutGoodInfo {
    private Long id;

    private Long outStoreId;

    private String goodBrand;

    private String goodName;

    private String goodModel;

    private String goodColor;

    private String goodSupplier;

    private String goodTraceMessage;

    private String returnFactoryConfig;

    private String goodApparentStatus;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}