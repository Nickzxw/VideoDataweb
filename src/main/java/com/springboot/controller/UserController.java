package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.service.UserService;
import com.springboot.serviceimpl.IUserServiceImpl;
import com.springboot.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

// 用户登录注册页面控制器
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 登录方法
    @PostMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map, HttpSession session) {
        String logname = request.getParameter("username");
        String logpassword = request.getParameter("password");
        session.setAttribute("loginUser", logname);
        User login = userService.login(logname, logpassword);
        if (login != null) {
            System.out.println("登录成功");
            return "redirect:/Visualization"; // 跳转到查询所有
        } else {
            map.put("msg", "用户名密码错误");
            return "/index"; // 跳转回到登录
        }
    }

    // 注册方法
    @PostMapping("/register")
    public String register(User user, String code, HttpSession session, HttpServletRequest request) {
        String password = request.getParameter("password");
        String password2  = request.getParameter("password2");
        String sessionCode = (String)session.getAttribute("code"); // 生成的验证码
        // 忽略大小写, 比较用户输入的验证码与生成的验证码
        if (sessionCode.equalsIgnoreCase(code) && password.equals(password2)) { // 输入正确
            userService.register(user); // 注册
            System.out.println("注册成功");
            return "redirect:/index"; // 注册成功跳转到登录界面
        } else { // 输入错误
            System.out.println("注册失败");
            return "redirect:/index"; // 注册失败跳转到注册界面
        }
    }

    // 生成验证码
    @GetMapping("/code")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {
        // 生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        // 存入session作用域中
        session.setAttribute("code", securityCode);
        // 响应图片
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image, "png", os);
    }
}
