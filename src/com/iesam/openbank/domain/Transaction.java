package com.iesam.openbank.domain;

public class Transaction {
    private final String transactionId;
    private String description;
    private double amountMovement;

    public Transaction(String transactionId, String description, double amountMovement) {
        this.transactionId = transactionId;
        this.description = description;
        this.amountMovement = amountMovement;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmountMovement() {
        return amountMovement;
    }

    public void setAmountMovement(double amountMovement) {
        this.amountMovement = amountMovement;
    }
}
