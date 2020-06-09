package com.test.springboot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("t_user")
@Accessors(chain = true)
public class User implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer uId;
    private String uName;
    private String uSex;
    private Integer uAge;
}
