package com.netraenis;

import java.util.ArrayList;

public class Contact {
    private ArrayList<String> contactArray = new ArrayList<String>();

    //Add contact
    public void saveContact(String name) {
        if (userExists(name)){
            System.out.println("User name: " + name + " already exists");
        } contactArray.add(name);
    }

    public void editUser(String currentName, String newName) {
        int position = findUserIndex(currentName);
        contactArray.set(position, newName);
    }

    public int findUserIndex(String name) {
        if (userExists(name)) {
            return contactArray.indexOf(name);
        }
        return -1;
    }

    public boolean userExists(String name){
        int searchIndex = contactArray.indexOf(name);
        if (searchIndex >= 0){
            return true;
        } return false;

    }




}
