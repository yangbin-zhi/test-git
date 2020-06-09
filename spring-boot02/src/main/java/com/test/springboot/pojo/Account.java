package com.test.springboot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "t_account")
public class Account implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer aId;
    private String aUsername;
    private String aPassword;
    private String aPhone;
    private String aEmail;
    private String aGithub;

}
