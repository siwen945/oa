package com.xy.oaservice.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @program: oa
*
* @description: 
* @author: xiaoyu.li
* @create: 2021-11-16 15:44
**/
@Data
@TableName("tb_lingjie_anzhaung")
public class AnZhuang implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String contractNum;

    private Integer approvalStatus;

    private String productName;

    private String xinghao;

    private Integer taishu;

    private BigDecimal contractMoney;

    private String kpjfk;

    private BigDecimal backMoney;

    private String cgzfmx;

    private BigDecimal zhifushuetj;

    private String lldbh;

    private String beizhu;

    private String opinion;

    private String opinionone;

    private String opiniontwo;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Date jctime;

    private Date wgtime;

    private BigDecimal banzujiesuan;

    private String sgbanzu;



}