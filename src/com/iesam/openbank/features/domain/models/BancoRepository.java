package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.BankAcc;

public interface BancoRepository {
    BankAcc obtainBankAcc(String numeroCuenta);
    void saveBankAcc(BankAcc bankAcc);


}
