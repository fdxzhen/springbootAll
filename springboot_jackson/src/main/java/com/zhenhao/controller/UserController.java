package com.zhenhao.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhenhao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    ObjectMapper mapper;

    @RequestMapping("getuser")
    public String getUser(){

        try{
            User user = new User();
            user.setUserName("zhenhao");
            user.setBirthday(new Date());
            String str = mapper.writeValueAsString(user);
            return str;
        }catch (Exception e){
            e.printStackTrace();
        }
         return null;
    }

    @RequestMapping("/getuser1")
    public User getUser1(){
        User user = new User();
        user.setUserName("hah");
        user.setBirthday(new Date());
        user.setAge(19);
        return user;
    }

    @RequestMapping("readjsonstring")
    public String readJsonString() {
        try {
            String json = "{\"name\":\"zhenhao\",\"age\":20}";
            JsonNode node = this.mapper.readTree(json);
            String name = node.get("name").asText();
            int age = node.get("age").asInt();
            return name + " " + age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("readjsonasobject")
    public String readJsonAsObject() {
        try {
            String json = "{\"name\":\"mrbird\",\"age\":26}";
            User user = mapper.readValue(json, User.class);
            String name = user.getUserName();
            int age = user.getAge();
            return name + " " + age;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
