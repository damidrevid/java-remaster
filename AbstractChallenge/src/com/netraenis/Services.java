package com.netraenis;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class Services implements User {

    private String name;
    private boolean provider;
    private List<Customer> customers;

    public Services(String name, boolean provider) {
        this.name = name;
        this.provider = provider;
        this.customers = new ArrayList<Customer>();
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void saveUser() {

    }

    @Override
    public void searchUser() {

    }

}
