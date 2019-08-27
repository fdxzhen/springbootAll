package com.zhenhao.service;

import com.zhenhao.bean.User;


public interface UserService {

    public void insert(User user);

    public void delete(int id);

    public void update(User user);
}
