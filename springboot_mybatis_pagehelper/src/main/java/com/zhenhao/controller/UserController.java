package com.zhenhao.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhenhao.bean.User;
import com.zhenhao.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    UserDao userDao;
    //http://localhost:8888/getUserList?pageNum=1&pageSize=2
    @RequestMapping("/getUserList")
    public Page<User> getUserList(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Page<User> userList = userDao.getUserList();
        return userList;
    }

    @RequestMapping("/page")
    public String index(Model model,int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Page<User> userList = userDao.getUserList();
        model.addAttribute("userlist",userList);
        return "index";
    }

    @RequestMapping("index")
    public String index1(){
        return "index";
    }
}
