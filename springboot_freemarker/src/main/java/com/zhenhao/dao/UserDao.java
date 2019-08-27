package com.zhenhao.dao;

import com.zhenhao.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Mapper
public interface UserDao {
    @Insert("insert into user(name,age) values (#{name},#{age})")
    public void insert(User user);

    @Delete("delete user where id = #{id}")
    public void delete(int id);

    @Update("update user set name=#{name},age=#{age}  where id=#{id}")
    public void update(User user);
}
