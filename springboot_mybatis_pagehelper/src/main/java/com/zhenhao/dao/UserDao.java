package com.zhenhao.dao;


import com.github.pagehelper.Page;
import com.zhenhao.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user")
    Page<User> getUserList();

}
