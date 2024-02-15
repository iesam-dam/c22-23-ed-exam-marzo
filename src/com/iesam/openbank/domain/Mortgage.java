package com.iesam.openbank.domain;

public class Mortgage {
    private final String accountId;
    private final String code;
    private String name;
    private String description;
    private final String startDate;
    private double tax;
    private String endDate;
    private double amount;

    public Mortgage(String accountId, String code, String name, String description, String startDate, double tax, String endDate, double amount) {
        this.accountId = accountId;
        this.code = code;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.tax = tax;
        this.endDate = endDate;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }


    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Mortgage{" +
                "accountId='" + accountId + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startDate='" + startDate + '\'' +
                ", tax=" + tax +
                ", endDate='" + endDate + '\'' +
                ", amount=" + amount +
                '}';
    }

}
