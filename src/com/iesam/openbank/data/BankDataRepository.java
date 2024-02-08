package com.iesam.openbank.data;

import com.iesam.openbank.domain.*;

import java.util.ArrayList;

public class BankDataRepository implements BankRepository {
    //singleton
    private static BankDataRepository instance=null;
    public static BankDataRepository newInstance(){
        if(instance==null){
            instance = new BankDataRepository();
        }
        return instance;
    }
    private ArrayList<Transaction> transactionList=new ArrayList<>();
    private ArrayList<Mortgage> mortgageList=new ArrayList<>();
    private ArrayList<Customer> customerList=new ArrayList<>();
    private ArrayList<BankAccount> bankAccountList= new ArrayList<>();
    private BankDataRepository(){
        initData();
    }
    private void initData(){
        customerList.add(new Customer("1","juan","zuniga","avenida","avila","05002"));
        bankAccountList.add(new BankAccount("1","1",1200));
        transactionList.add(new Transaction("T1","1","Retiro",150));
        mortgageList.add(new Mortgage("1","M1","mortgage","mortgage of house","12-12-2023",2.2,"12-12-2033",15000));
    }
    @Override
    public void createBankAccount(BankAccount bankAccount) {
        for(int i=0; i<customerList.size(); i++){
            if(customerList.get(i).getDni().equals(bankAccount.getCustomer())){
                customerList.get(i).setBankAccount(bankAccount);
            }
        }
        bankAccountList.add(bankAccount);

    }

    @Override
    public void createCustomer(Customer customer,BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
        customerList.add(customer);
    }

    @Override
    public void createMortgage(Mortgage mortgage) {
        for(int i=0; i<bankAccountList.size(); i++){
            if(bankAccountList.get(i).getNumberAccount().equals(mortgage.getAccountId())){
                bankAccountList.get(i).setMortgages(mortgage);

            }
        }
        mortgageList.add(mortgage);
    }

    @Override
    public void createTransaction(Transaction transaction) {
        if(transaction.getAmountMovement()<0){
            transaction.setDescription("retiro de "+transaction.getAmountMovement());
        }else{
            transaction.setDescription("ingreso de "+transaction.getAmountMovement());
        }
        for(int i=0; i<bankAccountList.size(); i++){
            if(bankAccountList.get(i).getNumberAccount().equals(transaction.getAccountId())){
                bankAccountList.get(i).setTransaction(transaction);
            }
        }
        transactionList.add(transaction);
    }

    @Override
    public Customer getCustomer(String dni) {
        for(Customer customer:customerList){
            if(customer.getDni().equals(dni)){
                return customer;
            }
        }
        return null;
    }
}
