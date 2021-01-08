package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class InStore extends BaseEntity<Long> {
    private Byte returnInStoreFlag;

    private String returnFactoryLocation;

    private String inStoreNote;

    private String documentMaker;

    private Date makingTime;

    private String approver;

    private String approvalOpinion;

    private Date approvalTime;

    private Byte approvalStatus;
}