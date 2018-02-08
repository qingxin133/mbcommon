package com.hehe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hehe.entity.User;
import com.hehe.mapper.UserMapper;
import com.hehe.tools.BaseServiceImpl;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	
	 @Autowired
	 private UserMapper userMapper;//这里会报错，但是并不会影响
	 
	 
    //这个方式我自己加的
	@Override
    public List<User> selectAllUser(){
    	return userMapper.selectAllUser();
    }
}
