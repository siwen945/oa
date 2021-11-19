package com.xy.oaservice.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
* @program: oa
* @description:
* @author: xiaoyu.li
* @create: 2021-11-16 18:18
**/
@Data
@TableName("t_oa_menu")
public class Menu implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String menuName;

    private Integer parentId;

    private String route;

    private String summary;

    private String remork1;

    private Integer remork2;

    private String remork3;

}