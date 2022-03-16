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

    public void editUser(int position, String newName) {

        contactArray.set(position, newName);
    }

    public int void findUser(String name) {
        if (!userExists(name)) {
            System.out.println("User does not exist");
        } else {
            return int unserIndex = contactArray.indexOf(name);
        }
    }

    public boolean userExists(String name){
        int searchIndex = contactArray.indexOf(name);
        if (searchIndex >= 0){
            return true;
        } return false;

    }




}
