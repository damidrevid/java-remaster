package com.netraenis;

public class VipCustomer {
    private String userName;
    private double creditLimit;
    private String userEmail;

    public VipCustomer() {
        this("Dami", 50000, "oludre@gmail.com");
    }

    public VipCustomer(String userName, double creditLimit) {
        this.userName = userName;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String userName, double creditLimit, String userEmail) {
        this(userName, creditLimit);
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
