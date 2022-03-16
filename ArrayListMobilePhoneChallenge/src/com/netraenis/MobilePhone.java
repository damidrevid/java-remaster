package com.netraenis;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contactArray;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactArray = new ArrayList<Contact>();
    }



    //    private Contact phoneContact;

    //Add contact
    public void saveContact(Contact name) {
        if (userExists(name)){
            System.out.println("User name: " + name + " already exists");
        } else {
            contactArray.add(name);
            System.out.println("User " + name + " has been added");
        }

    }

    public void editUser(Contact currentName, Contact newName) {
        int position = findUserIndex(currentName);
        if(position >= 0) {
            contactArray.set(position, newName);
            System.out.println("Old contact " + currentName + " was replaced with " + newName);
        } else {
            System.out.println("User not found");
        }
    }

    public void removeUser(Contact name) {
        if (userExists(name)) {
            contactArray.remove(findUserIndex(name));
            System.out.println("Contact " + name + " was deleted");
        } else {
            System.out.println("Delete operation failed, user does not exist");
        }
    }

    public void searchUser(Contact name) {
        if (userExists(name)) {
            System.out.println("A user with the name " + name + " found on the Database");
        }
    }

    public Contact searchUser(String name) {
        int position = contactArray.indexOf(name);
        if(position>=0) {
            return this.contactArray.get(position);
        }
        return null;
    }

    public void printContact() {
        System.out.println("View your contact list below:");
        for (int a = 0; a <contactArray.size(); a++) {
            System.out.println("Contact " + (a+1) + ": " + contactArray.get(a).getName()
            + "==>" + contactArray.get(a).getPhoneNumber() );
        }
    }


    private int findUserIndex(Contact name) {
        if (userExists(name)) {
            return contactArray.indexOf(name);
        }
        return -1;
    }

    private boolean userExists(Contact name){
        int searchIndex = contactArray.indexOf(name);
        if (searchIndex >= 0){
            return true;
        } return false;

    }
}
