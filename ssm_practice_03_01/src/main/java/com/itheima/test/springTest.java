package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {
    /*@Autowired
    private AccountDao accountDao;*/
    /*@Test
    public void run1(){
        *//*此时通过此方式来加载spring的配置文件applicationContext.xml，
        等到spring整合springmvc时，就需要启动tomcat时不仅要加载springmvc.xml，
        也需要加载applicationContext.xml*//*
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = ac.getBean("accountService", AccountService.class);

        Account account = new Account();
        account.setName("张叁枫");
        account.setMoney(666d);
        as.saveAccount(account);

    }*/
}
