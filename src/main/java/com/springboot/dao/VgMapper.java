package com.springboot.dao;

import com.springboot.entity.Dbvgdata;
import com.springboot.entity.UserInterestGenre;
import com.springboot.entity.UserInterestPublisher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VgMapper {
    //  根据id查询
    UserInterestGenre findById(Integer id);
    UserInterestPublisher PubfindById(Integer id);
    Dbvgdata findByIdDB(Integer id);
    List<Dbvgdata> selectAll();
}
