package com.chapter.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chapter.accounts.dto.Account;
import com.chapter.accounts.service.AccountService;

@RestController
//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping(path="/account")
public class AccountController {
    
    @Autowired
	private AccountService accountervice;

    @GetMapping
	private ResponseEntity<List<Account>> listAllAccounts (){	
		return ResponseEntity.ok(accountervice.getAllAccount());		
	} 
    
    @GetMapping("/id")
    private ResponseEntity<List<Account>> findByPerson (Integer id){ 
      return ResponseEntity.ok(accountervice.findAccountByPerson(id));    
    }
    
    @PostMapping
  private ResponseEntity<Account> createAccount(Account account){ 
    return ResponseEntity.ok(accountervice.saveAccount(account));    
  }
    
    @PutMapping
  private ResponseEntity<Account> updateAccount (Account account){ 
    return ResponseEntity.ok(accountervice.updateAccount(account));    
  }

}
