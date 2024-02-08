package com.iesam.openbank.domain;

public class SaveBankAccountUseCase {
    private final BankRepository bankRepository;

    public SaveBankAccountUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public void execute(BankAccount bankAccount){
        this.bankRepository.createBankAccount(bankAccount);
    }
}
