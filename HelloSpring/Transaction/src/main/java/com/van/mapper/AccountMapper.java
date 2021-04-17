package com.van.mapper;

import com.van.pojo.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface AccountMapper {
    List<Account> getAccounts();

    @Select("select * from test.account where id = #{id}")
    //如果sql有多个参数，参数前要添加Param注解
    Account getAccountById(int id);

    int trans(@Param("transAC") String transAC, @Param("transAmount") float transAmount);

    int debitAndCredit(String debitAC, String creditAC, float transAmount);
}
