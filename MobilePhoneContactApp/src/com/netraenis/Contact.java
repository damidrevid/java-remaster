package com.netraenis;

import java.util.ArrayList;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Static method of creating a new contact
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
