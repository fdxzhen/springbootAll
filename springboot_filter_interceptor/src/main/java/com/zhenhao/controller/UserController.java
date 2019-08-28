package com.zhenhao.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping("/{id:\\d+}")
    public void get(@PathVariable String id){
        System.out.println(id);
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
