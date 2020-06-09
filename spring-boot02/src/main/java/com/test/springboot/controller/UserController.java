package com.test.springboot.controller;

import com.test.springboot.pojo.Account;
import com.test.springboot.pojo.User;
import com.test.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    public ModelAndView findAll() {
        List<User> list = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("listUser");
        return mv;
    }

}
