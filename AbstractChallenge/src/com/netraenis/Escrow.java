package com.netraenis;

import java.util.ArrayList;
import java.util.List;

public class Escrow implements User {
    private List<Customer> customers;
    private double amount;

    public Escrow(double amount){
        this.amount = amount;
        this.customers = new ArrayList<>();
    }

    @Override
    public void deleteUser() {
        System.out.println("Chai!");
    }

    @Override
    public void saveUser() {


    }

    @Override
    public void searchUser() {

    }
}
