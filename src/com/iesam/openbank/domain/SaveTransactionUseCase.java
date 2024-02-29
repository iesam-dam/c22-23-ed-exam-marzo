package com.iesam.openbank.domain;

public class SaveTransactionUseCase {
    private final BankRepository bankRepository;

    public SaveTransactionUseCase(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }
    public void execute(Transaction transaction){
        this.bankRepository.createTransaction(transaction);
    }
}
