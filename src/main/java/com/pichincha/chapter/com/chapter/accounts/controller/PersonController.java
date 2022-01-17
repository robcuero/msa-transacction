package com.chapter.accounts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chapter.accounts.dto.Person;
import com.chapter.accounts.service.PersonService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.PUT,RequestMethod.POST})
@RequestMapping(path="/person")
public class PersonController {
    
    @Autowired
	private PersonService personService;

    @PostMapping
  private ResponseEntity<Person> createAccount(Person person){ 
    return ResponseEntity.ok(personService.savePerson(person));    
  }
    
    @PutMapping
  private ResponseEntity<Person> updateAccount (Person person){ 
    return ResponseEntity.ok(personService.updatePerson(person));    
  }

}
