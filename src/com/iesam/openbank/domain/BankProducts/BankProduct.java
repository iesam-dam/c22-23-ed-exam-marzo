package com.iesam.openbank.domain.BankProducts;

public class BankProduct {
    private final String code;
    private final String name;
    private final String numberAccount;
    private final String description;

    public BankProduct(String code, String name, String numberAccount, String description) {
        this.code = code;
        this.name = name;
        this.numberAccount = numberAccount;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    @Override
    public String toString() {
        return "BankProduct{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
