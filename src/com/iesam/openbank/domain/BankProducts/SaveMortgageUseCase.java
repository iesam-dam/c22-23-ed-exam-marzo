package com.iesam.openbank.domain.BankProducts;

import com.iesam.openbank.domain.BankRepository;

public class SaveMortgageUseCase {
    private final BankRepository bankRepository;

    public SaveMortgageUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public void execute(Mortgage mortgage){
        this.bankRepository.createMortgage(mortgage);
    }
}
