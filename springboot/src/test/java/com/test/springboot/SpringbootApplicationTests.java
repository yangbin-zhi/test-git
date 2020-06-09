package com.test.springboot;

import com.test.dao.UserDao;
import com.test.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        List<User> list = userDao.selectList(null);
        System.out.println(list);
    }

}
