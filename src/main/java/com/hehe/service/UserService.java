package com.hehe.service;

import java.util.List;

import com.hehe.entity.User;
import com.hehe.tools.BaseService;

public interface UserService extends BaseService<User> {
    //这个方式我自己加的
    List<User> selectAllUser();
}
