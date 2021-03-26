package com.springboot.serviceimpl;

import com.springboot.dao.VgMapper;
import com.springboot.entity.Dbvgdata;
import com.springboot.service.VgService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class VgServiceImpl implements VgService{
     @Autowired
     VgMapper vgMapper;
     @Override
     public List<Dbvgdata> selectAll(){
          return this.vgMapper.selectAll();
     }
}
