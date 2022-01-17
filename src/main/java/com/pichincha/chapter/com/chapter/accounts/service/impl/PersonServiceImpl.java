package com.chapter.accounts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chapter.accounts.dto.Person;
import com.chapter.accounts.repository.PersonRepository;
import com.chapter.accounts.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
	private PersonRepository PersonRepository;
			
	public Person savePerson(Person person){
    return PersonRepository.save(person);
  }
	
	public Person updatePerson(Person person){
	  Person personActual=PersonRepository.findById(person.getId()).get();
	  personActual.setName(person.getName());
	  personActual.setLastName(person.getLastName());
	  personActual.setCi(person.getCi());
	  return PersonRepository.save(personActual);
  }
	
}
