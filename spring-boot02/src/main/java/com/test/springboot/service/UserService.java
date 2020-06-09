package com.test.springboot.service;

import com.test.springboot.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     */
    List<User> findAll();

    /**
     * 插入用户
     */
    int insertUser(User user);
}
