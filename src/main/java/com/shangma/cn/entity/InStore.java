package com.shangma.cn.entity;

import lombok.Data;

import java.util.Date;

@Data
public class InStore {
    private Long id;

    private Byte returnInStoreFlag;

    private String returnFactoryLocation;

    private String inStoreNote;

    private String documentMaker;

    private Date makingTime;

    private String approver;

    private String approvalOpinion;

    private Date approvalTime;

    private Byte approvalStatus;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;
}