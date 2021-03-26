package com.springboot.dao;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper{
    // 登录注册
    void save(User user);
    User login(@Param("username") String username, @Param("password") String password);
}
