package com.chapter.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chapter.accounts.dto.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
