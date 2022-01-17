package com.chapter.accounts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.chapter.accounts.dto.Transacction;
@Repository
public interface TransacctionRepository extends JpaRepository<Transacction, Integer> {
  @Query("SELECT t FROM Transacction t WHERE t.idAccount=?1"
      + "and date between '?2' and '?3'")
  List<Transacction> findTransacctionByAccount(Integer idAccount,String dateBegin,String dateFinish);
}
