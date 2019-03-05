package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

//这里是接口，不能实例化，所以不能使用注解
public interface AccountDao {

//    保存一条记录
    /*@Insert("insert into account (name,money) values(#{name},#{money})")
    void saveAccount(Account account);*/

    //登录查询
    @Select("select * from account where username=#{username} and password=#{password}")
    Account findOne(Account account);
}
