package com.chapter.accounts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chapter.accounts.dto.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
  @Query("SELECT a FROM Account a WHERE a.idPerson= ?1")
  List<Account> findAccountByPerson(Integer idPerson);
}
