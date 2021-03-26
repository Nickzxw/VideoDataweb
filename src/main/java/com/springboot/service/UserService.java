package com.springboot.service;

import com.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
/**
 *  登录注册业务层接口
 */
public interface UserService {
    void register(User user);
    User login(String username, String password);
}
