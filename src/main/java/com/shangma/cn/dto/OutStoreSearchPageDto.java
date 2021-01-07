package com.shangma.cn.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author:Mei
 * @create:2021-01-07 14:49
 */

@Data
public class OutStoreSearchPageDto {

    /*返厂出库单号*/
    private Long Id;

    /*返厂出库标志(1 -已出库，2 -未出库)*/
    private Byte returnOutStoreFlag;

    /*审批状态 1 -已审核 2 -未审核 3 -不通过*/
    private Byte approvalStatus;

    /*制单人*/
    private String documentMaker;

    /*制单时间*/
    private Date makingTime1;

    /*制单时间*/
    private Date makingTime2;

    /*审批时间*/
    private Date approvalTime1;

    /*审批时间*/
    private Date approvalTime2;

    public OutStoreSearchPageDto() {
    }

    public OutStoreSearchPageDto(Long id, Byte returnOutStoreFlag, Byte approvalStatus, String documentMaker, Date makingTime1, Date makingTime2, Date approvalTime1, Date approvalTime2) {
        Id = id;
        this.returnOutStoreFlag = returnOutStoreFlag;
        this.approvalStatus = approvalStatus;
        this.documentMaker = documentMaker;
        this.makingTime1 = makingTime1;
        this.makingTime2 = makingTime2;
        this.approvalTime1 = approvalTime1;
        this.approvalTime2 = approvalTime2;
    }

    @Override
    public String toString() {
        return "OutStoreSearchPageDto{" +
                "Id=" + Id +
                ", returnOutStoreFlag=" + returnOutStoreFlag +
                ", approvalStatus=" + approvalStatus +
                ", documentMaker='" + documentMaker + '\'' +
                ", makingTime1=" + makingTime1 +
                ", makingTime2=" + makingTime2 +
                ", approvalTime1=" + approvalTime1 +
                ", approvalTime2=" + approvalTime2 +
                '}';
    }
}
