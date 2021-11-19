package com.xy.oaweb.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xy.oacommon.controller.BaseController;
import com.xy.oacommon.controller.Result;
import com.xy.oacommon.util.Validator;
import com.xy.oaservice.dao.entity.AnZhuang;
import com.xy.oaservice.dao.mapper.AnZhuangMapper;
import com.xy.oaservice.dto.in.AnZhuangIVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
* @program: oa
*
* @description: ceshi
* @author: xiaoyu.li
* @create: 2021-11-15 17:13
**/
@RestController
@RequestMapping("/all")
@Api(value = "顺企 - 顺企安装", tags = {"shunqi- oa - anzhuang"}, description = "顺企 - 顺企安装")
public class AnZhuangController extends BaseController {

    @Autowired
    private AnZhuangMapper anZhuangMapper;

    @ApiOperation(value = "查询顺企安装", notes = "查询顺企安装")
    @RequestMapping(value = "/findAnZhuang", method = RequestMethod.POST)
    public Result<IPage<AnZhuang>> findAnZhuang(@RequestBody AnZhuangIVO anZhuangIVO) {

        IPage page = new Page();

        if (Validator.isNotNullOrEmpty(anZhuangIVO.getPageNum()) && Validator.isNotNullOrEmpty(anZhuangIVO.getSizeNum())) {
            page.setSize(anZhuangIVO.getSizeNum());
            page.setCurrent(anZhuangIVO.getPageNum());
        }
        QueryWrapper<AnZhuang> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().orderByDesc(AnZhuang::getId);

        if (Validator.isNotNullOrEmpty(anZhuangIVO.getContractNum())) {
            queryWrapper.lambda().like(AnZhuang::getContractNum, anZhuangIVO.getContractNum());
        }

        if (Validator.isNotNullOrEmpty(anZhuangIVO.getProductName())) {
            queryWrapper.lambda().like(AnZhuang::getProductName, anZhuangIVO.getProductName());
        }
        IPage<AnZhuang> anZhuangPage = anZhuangMapper.selectPage(page, queryWrapper);

//        AnZhuang anZhuang = anZhuangMapper.selectOne(new QueryWrapper<AnZhuang>().lambda().eq(AnZhuang::getContractNum, "18AZ-053"));
        return Result.ok(anZhuangPage);
    }



}