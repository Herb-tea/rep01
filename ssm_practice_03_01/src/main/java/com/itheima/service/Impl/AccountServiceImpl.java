package com.itheima.service.Impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /*@Override
    public void saveAccount(Account account) {
        System.out.println("业务层方法");
        accountDao.saveAccount(account);
        return;
    }*/
    @Override
    public Account findOne(Account account) {

        Account ac = null;
        try {
            ac = accountDao.findOne(account);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("业务层成功被调用，spring框架可正常使用！");
        return ac;
    }
}
