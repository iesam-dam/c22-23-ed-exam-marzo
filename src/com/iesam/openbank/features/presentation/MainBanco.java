package com.iesam.openbank.features.presentation;

import com.iesam.openbank.features.data.*;
import com.iesam.openbank.features.domain.*;
import com.iesam.openbank.features.domain.models.*;


public class MainBanco {

    public static void printBankAcc(String bankAccId){
        GetBancoFeed getBancoFeed = new GetBancoFeed(BancoDataRepository.newInstance());
        BankAcc bankAcc = getBancoFeed.execute(bankAccId);
        System.out.println(bankAcc.toString());
    }

    public static void createBankAcc(BankAcc bankAcc){
        BancoDataRepository bancoDataRepository = BancoDataRepository.newInstance();
        SaveBancoFeed saveBancoFeed = new SaveBancoFeed(bancoDataRepository);
        saveBancoFeed.execute(bankAcc);
    }
    public static void createProduct(Producto producto){
        ProductDataRepository productDataRepository = ProductDataRepository.newInstance();
        SaveProductFeed saveProductFeed = new SaveProductFeed(productDataRepository);
        saveProductFeed.execute(producto);
    }
    public static void createMovements(Movements movements){
        MovementsDataRepository movementsDataRepository = MovementsDataRepository.newInstance();
        SaveMovementsFeed saveMovementsFeed = new SaveMovementsFeed(movementsDataRepository);
        saveMovementsFeed.execute(movements);
    }

    public static void createCustomer(Customer customer){
        CustomerDataRepository customerDataRepository = CustomerDataRepository.newInstance();
        SaveCustomerFeed saveCustomerFeed = new SaveCustomerFeed(customerDataRepository);
        saveCustomerFeed.execute(customer);
    }
}
