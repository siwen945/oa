package com.xy.oaservice.dto.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
* @program: oa
*
* @description: 
* @author: xiaoyu.li
* @create: 2021-11-15 17:28
**/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "安装查询入参实体")
public class AnZhuangIVO implements Serializable {

    private static final long serialVersionUID = -9106059817330727021L;

    @ApiModelProperty(value = "合同号", example="18AZ-054")
    private String contractNum;

    @ApiModelProperty(value = "单位名称", example="上海纺原物业有限公司")
    private String productName;

    @ApiModelProperty(value = "页", example="1")
    private int pageNum;

    @ApiModelProperty(value = "行", example="10")
    private int sizeNum;



}