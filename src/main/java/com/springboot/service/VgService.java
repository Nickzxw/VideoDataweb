package com.springboot.service;


import com.springboot.entity.Dbvgdata;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VgService {
    List<Dbvgdata> selectAll();
}
