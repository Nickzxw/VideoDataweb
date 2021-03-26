package com.springboot.dao;

import com.springboot.entity.UserInterestGenre;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 获取游戏类别信息
@Mapper
public interface UserInterestMapper {
    List<UserInterestGenre> selectGenreValue();
}
