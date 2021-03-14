package com.van.dao.impl;

import com.van.dao.AccountMapper;
import com.van.pojo.Account;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class AccountMapperImpl implements AccountMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Account> getAccounts() {
        AccountMapper mapper = sqlSessionTemplate.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.getAccounts();
        return accounts;
    }

    @Override
    public List<Account> getAccountsByLimit(Map<String, Integer> map) {
        return null;
    }

    @Override
    public Account getAccountById(int id) {
        return null;
    }
}
