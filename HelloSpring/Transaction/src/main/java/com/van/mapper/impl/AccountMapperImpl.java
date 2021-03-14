package com.van.mapper.impl;

import com.van.mapper.AccountMapper;
import com.van.pojo.Account;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;
import java.util.Map;

public class AccountMapperImpl extends SqlSessionDaoSupport implements AccountMapper {

    @Override
    public List<Account> getAccounts() {
        return getSqlSession().getMapper(AccountMapper.class).getAccounts();
    }

    @Override
    public Account getAccountById(int id) {
        return null;
    }

    @Override
    public int trans(String transAC, float transAmount) {
        return getSqlSession().getMapper(AccountMapper.class).trans(transAC, transAmount);
    }

    @Override
    public int debitAndCredit(String debitAC, String creditAC, float transAmount) {
        float tmpAmount = -(transAmount);
        trans(creditAC, transAmount);
        //int a = 1/0;
        trans(debitAC, tmpAmount);
        return 0;
    }
}
