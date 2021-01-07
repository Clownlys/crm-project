package com.shangma.cn.entity.base;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 开发者：辉哥
 * 特点： 辉哥很帅
 * 开发时间：2021/1/4 17:44
 * 文件说明：
 */
@Data
public class BaseEntity<ID> {
    private ID id;

    private LocalDateTime addTime;

    private Long creatorId;

    private LocalDateTime updateTime;

    private Long updateId;

    public void setData(){
        if(id==null){
            this.addTime=LocalDateTime.now();
            this.creatorId=1L;
        }
        this.updateTime=LocalDateTime.now();
        this.updateId=2L;
    }

}
