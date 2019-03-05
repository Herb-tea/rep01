package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/account")
public class AccountController {
    /*通过监听器的作用，applicationContext.xml配置文件能被加载了，
      所以其中配置的扫描起作用，service被放入IOC容器进行管理*/
        @Autowired
        private AccountService accountService;

    /*@RequestMapping("/save")
    public ModelAndView save(Account account, ModelAndView mv){
        *//*System.out.println("表现层");
        accountService.saveAccount(account);
        mv.addObject("ac",account);
        mv.setViewName("zjm");
        return mv;*//*

    }*/
    @RequestMapping("/login")
    public ModelAndView login(Account account ,ModelAndView mv){
        Account ac = accountService.findOne(account);
        if(ac!=null){
            mv.addObject("success_login","恭喜您，登录成功！");
            mv.setViewName("success");
            return mv;
        }else {
            mv.addObject("faile_login","账户或密码错误，请重新输入！");
            mv.setViewName("faile");
            return mv;
        }


    }
}
