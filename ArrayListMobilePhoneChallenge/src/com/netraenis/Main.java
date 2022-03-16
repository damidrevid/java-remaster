package com.netraenis;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("66133131");


    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("Enter action. (Press 6 to show available options)");
            int userAction = scan.nextInt();
            scan.nextLine();

            switch (userAction) {
                case 0:
                    System.out.println("Phone is shutting down");
                    quit = false;
                    break;
                case 1:
                    myPhone.printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    searchUser();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    public static void startPhone(){
        System.out.println("Phone is getting started...");
    }

//    public static void printContacts() {
//        myPhone.printContact();
//    }

    public static void addNewContact() {
        System.out.println("Enter user name");
        String userName = scan.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scan.nextLine();

        //
        Contact newContact = Contact.createContact(userName, phoneNumber);
        myPhone.saveContact(newContact);
    }

    public static void editContact(){
        System.out.println("Enter current contact name: ");
        String currentContact = scan.nextLine();
        Contact existingContact = myPhone.searchUser(currentContact);
        if (existingContact == null) {
            System.out.println("No user with the name " + currentContact + " found");
        } else
        {
            System.out.println("Enter the new name");
            String name = scan.nextLine();
            System.out.println("Enter the new number");
            String phoneNumber = scan.nextLine();
            Contact newContact = Contact.createContact(name, phoneNumber);

            myPhone.editUser(existingContact, newContact);
        }
    }

    public static void deleteContact(){
        System.out.println("Enter current contact name: ");
        String currentContact = scan.nextLine();
        Contact existingContact = myPhone.searchUser(currentContact);
        if (existingContact == null) {
            System.out.println("No user with the name " + currentContact + " found");
        } myPhone.removeUser(existingContact);
    }

    public static void searchUser() {
        System.out.println("Enter current contact name: ");
        String currentContact = scan.nextLine();
        Contact existingContact = myPhone.searchUser(currentContact);
        if (existingContact == null) {
            System.out.println("No user with the name " + currentContact + " found");
        } else{
            System.out.println("Name: " + existingContact.getName() +
                    "Phone number: " + existingContact.getPhoneNumber());
        }

    }

    public static void printActions() {
        System.out.println("\nAvailable actions: \nPress" +
                "\n0 - to shutdown" +
                "\n1 - to print Contacts" +
                "\n2 - to Add contact" +
                "\n3 - to Edit contact" +
                "\n4 - to Delete contact" +
                "\n5 - to Search contact" +
                "\n6 - to print a list of available options");
        System.out.println("Choose your action: ");
    }
}
