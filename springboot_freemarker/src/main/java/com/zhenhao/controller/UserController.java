package com.zhenhao.controller;

import com.zhenhao.bean.User;
import com.zhenhao.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/")
    public String index() {
        return "views/index";
    }

    @RequestMapping(value = "/welcome")
    public String home() {
        return "views/welcome";
    }

    @PostMapping("/login")
    public String login(User user, Model model) {
        userService.insert(user);
        model.addAttribute("user", user);
        return "views/list";
    }
}

