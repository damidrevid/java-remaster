package com.netraenis;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> bankCustomer;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.bankCustomer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBankCustomer() {
        return bankCustomer;
    }

    public boolean addCustomer(String name, double initialAmount) {
        // Check if customer already exist
        if(findCustomer(name) == null) {
            bankCustomer.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String name, double amount){
        Customer customerExists = findCustomer(name);
        if(customerExists != null ){
            customerExists.addTransactions(amount);
            return true;
        }
        return false;
    }


    private Customer findCustomer(String name) {
        for(int i = 0; i<bankCustomer.size(); i++){
            Customer checkCustomer = bankCustomer.get(i);
            if(checkCustomer.getName().equals(name)) {
                return checkCustomer;
            }
        }
        return null;
    }










}
