package com.chapter.accounts.service;

import java.util.List;

import com.chapter.accounts.dto.Account;

public interface AccountService {

  public List<Account> getAllAccount();

  Account saveAccount(Account account);

  Account updateAccount(Account account);

  List<Account> findAccountByPerson(Integer id);

}
