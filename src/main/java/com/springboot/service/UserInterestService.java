package com.springboot.service;


import com.springboot.entity.UserInterestGenre;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户兴趣业务层接口
 */
@Service
public interface UserInterestService {
    List<UserInterestGenre> selectGenreValue();
}
