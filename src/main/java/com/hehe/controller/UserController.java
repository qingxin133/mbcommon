package com.hehe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hehe.entity.User;
import com.hehe.service.UserService;
import com.hehe.tools.BaseService;
import com.hehe.tools.BaseServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User>{

    @Autowired
    UserService userService;
    
    @Autowired
    BaseService<User> baseService;

//    @ApiOperation("获取列表")
//    @GetMapping("list")
//    public List<User> list(User user) {
//    	System.out.println("wo shi ni baba");
//        return baseService.list(user);
//    }

    @RequestMapping("get")
    public User get(User user) {
        return userService.get(user);
    }

    @RequestMapping("update")
    public int update(User user) {
        return userService.update(user);
    }

    @RequestMapping("save")
    public int save(User user) {
        return userService.save(user);
    }

    @RequestMapping("delete")
    public int delete(User user) {
        return userService.delete(user);
    }

}
