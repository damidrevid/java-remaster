package com.netraenis;
import java.util.ArrayList;

public class Bank {
    private String branch;
    private ArrayList<Branch> bankBranch;

    public Bank(String branch) {
        this.branch = branch;
        this.bankBranch = new ArrayList<Branch>();
    }

    public String getBranch() {
        return branch;
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
            if(myBranch == null) {

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
