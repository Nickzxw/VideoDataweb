package com.springboot.serviceimpl;


import com.springboot.dao.UserMapper;
import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * 登录注册业务实现类
 */
@Service
@Transactional
public class IUserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userMapper.save(user);
    }
    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

}
