package com.test.controller;

import com.test.pojo.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        List<User> list = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list", list);
        mv.setViewName("listUser");
        return mv;
    }


}
