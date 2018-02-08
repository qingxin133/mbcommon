package com.hehe.mapper;

import java.util.List;

import com.hehe.entity.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * 继承通用Mapper获取CURD方法
 */
public interface UserMapper extends Mapper<User> {
    //这个方式我自己加的
    List<User> selectAllUser();
}
