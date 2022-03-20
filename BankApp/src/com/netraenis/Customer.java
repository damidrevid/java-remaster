package com.netraenis;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;


    public Customer(String name, double openingBalance) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransactions(openingBalance);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
        }

    public void addTransactions(double amount) {
        transaction.add(amount);
    }






}



