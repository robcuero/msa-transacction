package com.chapter.accounts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapter.accounts.dto.Account;
import com.chapter.accounts.dto.Transacction;
import com.chapter.accounts.repository.TransacctionRepository;
import com.chapter.accounts.service.TransacctionService;

@Service
public class TransacctionServiceImpl implements TransacctionService {

    @Autowired
	private TransacctionRepository transacctionRepository;
			
	public Transacction saveTransacction(Transacction transacction){
    return transacctionRepository.save(transacction);
  }
	
	public void deleteTransacction(Transacction transacction){	  
	   transacctionRepository.delete(transacction);;
  }
		
	 public List<Transacction> finTransacctionByAccount(Account account,String dateBegin,String dateFinish){    
     return transacctionRepository.findTransacctionByAccount(account.getId(),dateBegin,dateFinish);
  }
	
}
