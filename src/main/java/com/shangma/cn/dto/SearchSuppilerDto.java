package com.shangma.cn.dto;

import lombok.Data;

@Data
public class SearchSuppilerDto {
    private String supplierName;
    private String supplierContact;
    private String supplierPhone;
    private String supplierAddress;
    private String supplierBrank;
    private String supplierBrankCode;

    @Override
    public String toString() {
        return "SearchSuppilerDto{" +
                "supplierName='" + supplierName + '\'' +
                ", supplierContact='" + supplierContact + '\'' +
                ", supplierPhone='" + supplierPhone + '\'' +
                ", supplierAddress='" + supplierAddress + '\'' +
                ", supplierBrank='" + supplierBrank + '\'' +
                ", supplierBrankCode='" + supplierBrankCode + '\'' +
                '}';
    }
}
