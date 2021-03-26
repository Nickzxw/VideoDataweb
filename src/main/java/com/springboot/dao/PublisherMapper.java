package com.springboot.dao;


import com.springboot.entity.UserInterestPublisher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 游戏开放商Mapper
 */
@Mapper
public interface PublisherMapper {
    List<UserInterestPublisher> selectPublisherValue();
}
