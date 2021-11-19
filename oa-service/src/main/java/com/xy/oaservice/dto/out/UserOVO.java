package com.xy.oaservice.dto.out;

import com.xy.oaservice.dao.entity.Menu;
import com.xy.oaservice.dao.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
* @program: oa
*
* @description: 
* @author: xiaoyu.li
* @create: 2021-11-16 18:22
**/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户查询出参实体")
public class UserOVO {

    @ApiModelProperty(value = "菜单权限", example="18AZ-054")
    private List<Menu> menu;

    @ApiModelProperty(value = "用户信息", example="18AZ-054")
    private User user;

}