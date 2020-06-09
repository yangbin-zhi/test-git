package com.test.springboot.service.impl;

import com.test.springboot.dao.UserDao;
import com.test.springboot.pojo.User;
import com.test.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.selectList(null);
    }

    @Override
    public int insertUser(User user) {
        if (user.getUName().length() == 0 || user.getUName() == null) {
            return 0;
        }
        int rows = userDao.insert(user);
        if (rows < 1) {
            return 0;
        }
        return rows;
    }
}
