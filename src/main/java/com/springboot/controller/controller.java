package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 访问界面控制器
@Controller
public class controller {
    @GetMapping("/index")
    public String toIndex() {
        return "index";
    }

    @GetMapping("/Visualization")
    public String toVisualization() {
        return "Visualization";
    }

    @GetMapping("/toRegister")
    public String toRegister() {
        return "index";
    }
}
