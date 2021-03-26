package com.springboot.service;


import org.springframework.stereotype.Service;
import com.springboot.entity.UserInterestPublisher;

import java.util.List;


/**
 * 游戏开发商Service
 */
@Service
public interface PublisherService {
    List<UserInterestPublisher> selectPublisherValue();
}
