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

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted");
        return true;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int foundPosition = findContact(name);
        if(foundPosition >=0) {
            return this.myContact.get(foundPosition);
        }
        return null;
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i<this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContact() {
        System.out.println("View your contact list below:");
        for (int a = 0; a <this.myContact.size(); a++) {
            System.out.println("Contact " + (a+1) + ": " + myContact.get(a).getName()
                    + "==>" + myContact.get(a).getPhoneNumber() );
        }
    }

}
