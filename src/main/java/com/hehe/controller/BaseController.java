package com.hehe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.hehe.entity.PageVO;
import com.hehe.entity.User;
import com.hehe.service.UserService;
import com.hehe.tools.BaseService;
import io.swagger.annotations.ApiOperation;

/**
 *  @author tianyang
 *  20180116
 *
 * @param <T>
 */
public class BaseController<T> {
	
    @Autowired
    BaseService<T> baseService;
    
    @Autowired
    UserService userService;
    
    @ApiOperation("BaseController列表--主要验证通用service entity查询是否正常")
    @GetMapping("list")
    public PageVO<T> list(T entity,int pageNum, int pageSize) {
    	System.out.println("wo shi ni daye v2");
        return baseService.listPage(entity, pageNum, pageSize);
    }
    
    @ApiOperation(value="查询用户", notes="查询用户列表--这里主要是测试一下xml的形式是否正常")
    @RequestMapping(value = "/allUser/", method=RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public List<User> selectAllUser(){
    	System.out.println("I am all user *******************************");
    	return userService.selectAllUser();
    }

}
