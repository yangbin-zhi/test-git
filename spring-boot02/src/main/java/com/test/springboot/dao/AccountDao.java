package com.test.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.springboot.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountDao extends BaseMapper<Account> {
    /**
     * 账户登录
     */
    @Select("select * from t_account where a_username=#{aUsername} and a_password=#{aPassword}")
    Account loginAccount(@Param("aUsername") String aUsername, @Param("aPassword") String aPassword);
}
