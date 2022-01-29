package com.netraenis;

public class Main {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        System.out.println("Opening balance is " + bank.getAccountBalance());
        bank.deposit(5000);
        System.out.println("Your current balance is " + bank.getAccountBalance());
        bank.withdraw(50 00.01);
        System.out.println("Your current balance is " + bank.getAccountBalance());

    }
}
