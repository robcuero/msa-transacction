package com.chapter.accounts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapter.accounts.dto.Account;
import com.chapter.accounts.repository.AccountRepository;
import com.chapter.accounts.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
	private AccountRepository accountRepository;
		
	public List<Account> getAllAccount(){
		return accountRepository.findAll();
	}
	
	
	public Account saveAccount(Account account){
    return accountRepository.save(account);
  }
	
	public Account updateAccount(Account account){
	  Account accountActual=accountRepository.findById(account.getId()).get();
	  accountActual.setType(account.getType());
	  accountActual.setBalance(account.getBalance());
	  accountActual.setIdPerson(account.getIdPerson());
	  return accountRepository.save(accountActual);
  }
	
	 public List<Account> findAccountByPerson(Integer id){
	    return accountRepository.findAccountByPerson(id);
	  }
	  
	
}
