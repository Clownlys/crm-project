package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class InGoodInfo extends BaseEntity<Long> {
    private Long inStoreId;

    private String goodBrand;

    private String goodName;

    private String goodModel;

    private String goodColor;

    private String goodSupplier;

    private String goodTraceMessage;

    private Byte returnFactoryType;

    private Long changeGoodId;

}