package com.iesam.openbank.features.domain.models;

import com.iesam.openbank.features.domain.BankAcc;
public class GetBancoFeed {

    private BancoRepository bancoRepository;

    public GetBancoFeed(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    public BankAcc execute(String BankAccId){
        return this.bancoRepository.obtainBankAcc(BankAccId);
    }
}
