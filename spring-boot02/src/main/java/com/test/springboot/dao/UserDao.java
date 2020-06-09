package com.test.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
