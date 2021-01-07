package com.shangma.cn.entity;

import com.shangma.cn.entity.base.BaseEntity;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class OutStore extends BaseEntity<Long> {

    /*返厂出库标志(1 -已出库，2 -未出库)*/
    private Byte returnOutStoreFlag;

    /*返厂出库原因*/
    private String returnFactoryReason;

    /*返厂地点*/
    private String returnFactoryLocation;

    /*制单人*/
    private String documentMaker;

    /*制单时间*/
    private Date makingTime;

    /*审批人*/
    private String approver;

    /*审批意见*/
    private String approvalOpinion;

    /*审批时间*/
    private Date approvalTime;

    /*审批状态 1 -已审核 2 -未审核 3 -不通过*/
    private Byte approvalStatus;

    @Override
    public String toString() {
        return "OutStore{" +
                "returnOutStoreFlag=" + returnOutStoreFlag +
                ", returnFactoryReason='" + returnFactoryReason + '\'' +
                ", returnFactoryLocation='" + returnFactoryLocation + '\'' +
                ", documentMaker='" + documentMaker + '\'' +
                ", makingTime=" + makingTime +
                ", approver='" + approver + '\'' +
                ", approvalOpinion='" + approvalOpinion + '\'' +
                ", approvalTime=" + approvalTime +
                ", approvalStatus=" + approvalStatus +
                '}';
    }
}