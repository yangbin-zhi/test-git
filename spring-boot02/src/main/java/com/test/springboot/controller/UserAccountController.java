package com.test.springboot.controller;

import com.test.springboot.pojo.Account;
import com.test.springboot.pojo.User;
import com.test.springboot.service.AccountService;
import com.test.springboot.service.UserService;
import com.test.springboot.utils.VerifyCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

@Controller
@RequestMapping("/")
public class UserAccountController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @RequestMapping("accountRegister")
    public String accountRegister() {
        return "register";
    }

    @RequestMapping("register")
    public String register(User user, Account account) {
        System.out.println(user);
        System.out.println(account);
        int rows1 = userService.insertUser(user);
        int rows2 = accountService.insertAccount(account);
        if (rows1 == 1 && rows2 == 1) {
            return "redirect:registerSuccess";
        }
        return "register";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("loginAccount")
    public ModelAndView loginAccount(String aUsername, String aPassword, String checkCode, @SessionAttribute String verifyCode) {
        ModelAndView mv = new ModelAndView();
        //System.out.println(checkCode);
        // System.out.println("======");
        // System.out.println(verifyCode);
        if (!checkCode.equalsIgnoreCase(verifyCode)) {
            mv.addObject("info", "验证码错误");
            mv.setViewName("login");
            return mv;
        }
        boolean flag = accountService.loginAccount(aUsername, aPassword);
        //System.out.println("2222");
        if (!flag) {
            //System.out.println("8888");
            //return "redirect:accountSuccess";
            mv.setViewName("login");
        }
        mv.setViewName("accountSuccess");
        return mv;

    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping(value = "imgs")
    public void authImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //req.setCharacterEncoding("utf-8");
        //res.setContentType("text/html;charset=utf-8");
        // 设置http响应的文件MIME类型为图片
        response.setContentType("image/jpeg");
        // 不让浏览器记录此图片的缓存
        response.setDateHeader("expries", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        // 这里调用了一个工具类VerifyCodeUtils来生成指定位数(也可指定内容)的验证码字符串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(5);
        // 将生成验证码字符串保存到session域中,方面进行表单验证
        request.getSession().setAttribute("verifyCode", verifyCode);
        // 生成图片并写到响应输出流里. 因为register.jsp页面里的验证码图片宽高分别为180,30.这里使保持一致
        VerifyCodeUtils.outputImage(180, 30, response.getOutputStream(), verifyCode);
    }

}

