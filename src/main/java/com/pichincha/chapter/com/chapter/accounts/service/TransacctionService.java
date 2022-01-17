package com.chapter.accounts.service;

import com.chapter.accounts.dto.Transacction;

public interface TransacctionService {
  public Transacction saveTransacction(Transacction transacction);
  public void deleteTransacction(Transacction transacction);
}
