package com.iesam.openbank.domain.BankProducts;

public class Mortgage extends BankProduct{

    private final String startDate;
    private double tax;
    private String endDate;
    private double amount;

    public Mortgage(String code, String name, String numberAccount,String description, String startDate, double tax, String endDate, double amount) {
        super(code, name, numberAccount, description);
        this.startDate = startDate;
        this.tax = tax;
        this.endDate = endDate;
        this.amount = amount;
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
                ", startDate='" + startDate + '\'' +
                ", tax=" + tax +
                ", endDate='" + endDate + '\'' +
                ", amount=" + amount +
                '}';
    }

}
