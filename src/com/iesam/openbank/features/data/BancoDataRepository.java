package com.iesam.openbank.features.data;

import com.iesam.openbank.features.domain.BankAcc;
import com.iesam.openbank.features.domain.models.BancoRepository;

import java.util.ArrayList;

public class BancoDataRepository implements BancoRepository {

    private static BancoDataRepository instance = null;
    private ArrayList<BankAcc> localBank = new ArrayList<>();

    public static BancoDataRepository newInstance() {
        if (instance == null)
            instance = new BancoDataRepository();
        return instance;
    }

    @Override
    public BankAcc obtainBankAcc(String numeroCuenta) {
        for (BankAcc bankAcc : localBank)
            if (bankAcc.getNumeroCuenta().equals(numeroCuenta))
                return bankAcc;
        return null;
    }

    @Override
    public void saveBankAcc(BankAcc bankAcc) {
        localBank.add(bankAcc);
    }


}
