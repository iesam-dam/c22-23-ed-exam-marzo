package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.BankAcc;
public class SaveBancoFeed {

    private BancoRepository bancoRepository;

    public SaveBancoFeed(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    public void execute(BankAcc bankAcc){
        this.bancoRepository.saveBankAcc(bankAcc);
    }
}
