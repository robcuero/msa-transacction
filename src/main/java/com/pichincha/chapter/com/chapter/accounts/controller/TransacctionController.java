package com.chapter.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chapter.accounts.dto.Transacction;
import com.chapter.accounts.service.TransacctionService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.DELETE, RequestMethod.POST })
@RequestMapping(path = "/transacction")
public class TransacctionController {

  @Autowired
  private TransacctionService transacctionService;

  @PostMapping
  private ResponseEntity<Transacction> createTransacction(Transacction transacction) {
    return ResponseEntity.ok(transacctionService.saveTransacction(transacction));
  }

  @DeleteMapping
  private ResponseEntity<Long> deleteTransacction(Transacction transacction) {
    transacctionService.deleteTransacction(transacction);    
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
