package com.springboot.serviceimpl;

import com.springboot.entity.UserInterestPublisher;
import com.springboot.dao.PublisherMapper;
import com.springboot.service.PublisherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 游戏开放商ServiceImpl
 */
@Service
public class PublisherServieImpl implements PublisherService{
    @Autowired
    PublisherMapper publisherMapper;
    @Override
    public List<UserInterestPublisher> selectPublisherValue(){
        return this.publisherMapper.selectPublisherValue();
    }

}
