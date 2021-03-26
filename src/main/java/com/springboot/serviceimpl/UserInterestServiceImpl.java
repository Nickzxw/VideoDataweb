package com.springboot.serviceimpl;

import com.springboot.dao.UserInterestMapper;
import com.springboot.entity.UserInterestGenre;
import com.springboot.service.UserInterestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
 * 用户兴趣业务实现类
 */
@Service
public class UserInterestServiceImpl implements UserInterestService {
    @Autowired
    UserInterestMapper userInterestMapper;
    @Override
    public List<UserInterestGenre> selectGenreValue(){
        return this.userInterestMapper.selectGenreValue();
    }
}

