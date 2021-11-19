package com.xy.oaservice.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* @program: oa
*
* @description: 
* @author: xiaoyu.li
* @create: 2021-11-16 18:15
**/
@Data
@TableName("t_oa_user")
public class User implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String name;

    private Integer jobTitle;

    private String password;

    private String email;

    private String nickname;

    private Integer sex;

    private String addr;

    private Date carateTime;

    private Date updateTime;

}