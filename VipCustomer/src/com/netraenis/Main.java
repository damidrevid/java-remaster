package com.netraenis;

public class Main {

    public static void main(String[] args) {
        VipCustomer customer = new VipCustomer();

        System.out.println("Customer name is " + customer.getUserName());
        System.out.println("His/Her credit limit is " + customer.getCreditLimit());
        System.out.println("Customer email is " + customer.getUserEmail());
    }
}
