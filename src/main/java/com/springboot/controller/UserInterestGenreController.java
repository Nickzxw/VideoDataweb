package com.springboot.controller;

import com.springboot.entity.UserInterestGenre;
import com.springboot.service.UserInterestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

// 用户游戏兴趣控制器
@Controller
public class UserInterestGenreController {
    @Autowired //注入VgService
    UserInterestService userInterestService;
    @RequestMapping("/getUserInterestData")
    // 注解以JSON数据传走
    @ResponseBody
    public List showUserInterest(){
        List<UserInterestGenre> UserInterestList = new ArrayList<>();
        UserInterestList = userInterestService.selectGenreValue();
        return UserInterestList;
    }
}
