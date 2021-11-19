package com.xy.oaweb.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xy.oacommon.controller.BaseController;
import com.xy.oacommon.controller.Result;
import com.xy.oacommon.util.Validator;
import com.xy.oaservice.dao.entity.AnZhuang;
import com.xy.oaservice.dao.entity.Menu;
import com.xy.oaservice.dao.entity.User;
import com.xy.oaservice.dao.mapper.MenuMapper;
import com.xy.oaservice.dao.mapper.UserMapper;
import com.xy.oaservice.dto.in.AnZhuangIVO;
import com.xy.oaservice.dto.in.UserIVO;
import com.xy.oaservice.dto.out.UserOVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: oa
 * @description:
 * @author: xiaoyu.li
 * @create: 2021-11-16 18:13
 **/
@RestController
@RequestMapping("/all")
@Api(value = "顺企 - 顺企用户", tags = {"shunqi- oa - User"}, description = "顺企 - 顺企用户")
public class UserController extends BaseController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;


    @ApiOperation(value = "查询顺企安装", notes = "查询顺企安装")
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public Result<UserOVO> findAnZhuang(@RequestBody UserIVO userIVO) {

        if (Validator.isNullOrEmpty(userIVO.getPassword()) || Validator.isNullOrEmpty(userIVO.getUsername())) {
            return Result.failed("101", "账户或密码不能为空");
        }

        User user = userMapper.selectOne(new QueryWrapper<User>().lambda()
                .eq(User::getUsername, userIVO.getUsername()).eq(User::getPassword, userIVO.getPassword()));

        if (Validator.isNullOrEmpty(user)) {
            return Result.failed("102", "账户或密码错误");
        }

        List<Menu> menus = menuMapper.selectList(new QueryWrapper<Menu>().lambda().eq(Menu::getUsername, userIVO.getUsername()));

        UserOVO userOVO = UserOVO.builder()
                .menu(menus)
                .user(user)
                .build();
        logger.info("用户登录信息：{}", JSON.toJSONString(userOVO));
        return Result.ok(userOVO);

    }

}