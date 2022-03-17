package com.netraenis;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact contact) {
        int findPosition = findContact(oldContact);
        if(findPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContact.set(findPosition);
    }

    private int findContact(Contact contact)










}
