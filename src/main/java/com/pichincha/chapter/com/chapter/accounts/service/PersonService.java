package com.chapter.accounts.service;

import com.chapter.accounts.dto.Person;

public interface PersonService {
  public Person savePerson(Person person);
  public Person updatePerson(Person person);
}
