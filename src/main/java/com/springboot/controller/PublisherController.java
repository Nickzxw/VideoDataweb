package com.springboot.controller;

import com.springboot.entity.UserInterestPublisher;


import com.springboot.serviceimpl.PublisherServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

// 游戏开发商控制器
@Controller
public class PublisherController {
    @Autowired //注入Service
    PublisherServieImpl publisherServie;
    @RequestMapping("/getPublisherData")
    // 注解以JSON数据传走
    @ResponseBody
    public List showPublisher(){
        List<UserInterestPublisher> PublisherList = publisherServie.selectPublisherValue();
        return PublisherList;
    }
}
