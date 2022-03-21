package com.netraenis;
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranch;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.bankBranch = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addBranch(String name) {
        if(findBranch(name) == null) {
            bankBranch.add(new Branch(name));
            return true;
        }
        return false;
    }


    public boolean addCustomer(String branch, String name, double initialAmount) {
        Branch theBranch = findBranch(branch);
        if(theBranch != null ) {
            theBranch.addCustomer(name, initialAmount);
            return true;
        }
        System.out.println("You need to first Open a branch at " + branch);
        return false;
    }

    public boolean customerTransaction(String branch, String name, double deposit) {
        Branch customerBranch = findBranch(branch);
        if(customerBranch != null) {
            customerBranch.addTransaction(name, deposit);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String theBranch, boolean showTransaction) {
            Branch myBranch = findBranch(theBranch);
            if(myBranch != null) {
                System.out.println("Here's the customer list for Bank Branch in, " + myBranch.getBranchName() + ":");

                ArrayList<Customer> branchCustomers = myBranch.getBankCustomer();
                for(int i=0; i < branchCustomers.size(); i++) {
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("[" + (i + 1) + "] " + branchCustomer.getName());
                    if(showTransaction){
                        System.out.println("Transaction ");
                        ArrayList<Double> transactions = branchCustomer.getTransaction();
                        for (int j=0; j<transactions.size(); j++) {
                            System.out.println("["+ (j+1) + "] Amount " + transactions.get(j));
                        }
                    }
                } return true;
            }else {
                return false;
            }
    }


    private Branch findBranch(String name) {
        for(int a = 0; a<bankBranch.size(); a++) {
            Branch branchExists = bankBranch.get(a);
            if(branchExists.getBranchName().equals(name)){
                return branchExists;
            }
        }
        return null;
    }






}
