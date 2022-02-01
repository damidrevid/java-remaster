package com.netraenis;

public class BankAccount {
    private int accountNumber = 0;
    private double accountBalance = 0L;
    private String customerName = null;
    private String email = null;
    private int phoneNumber = 0;

    // Constructor
    public BankAccount() {
        System.out.println("Hi, I'm the default Constructor");
    }

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this. customerName = customerName; this.email=email;
        this.phoneNumber = phoneNumber;
    }

    //Setters and Getters for the Class fields.
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

//    public void setAccountBalance(double accountBalance) {
//        this.accountBalance = accountBalance;
//    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   // Deposit Fund
    public void deposit(double amount) {
        this.accountBalance += amount;
        System.out.println("You deposited " + this.accountBalance);
    }

    //Withdraw Fund
    public void withdraw(double amount) {
        if (this.accountBalance < amount) {
            System.out.println("Insufficient Fund");
        }
        else {
            this.accountBalance -= amount;
            System.out.println("Please, take your cash ");
        }
    }



}
