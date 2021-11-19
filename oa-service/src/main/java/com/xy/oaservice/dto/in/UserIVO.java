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
* @create: 2021-11-16 18:21
**/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户查询入参实体")
public class UserIVO implements Serializable {

    @ApiModelProperty(value = "密码", example="18AZ-054")
    private String password;

    @ApiModelProperty(value = "用户名", example="上海纺原物业有限公司")
    private String username;

}