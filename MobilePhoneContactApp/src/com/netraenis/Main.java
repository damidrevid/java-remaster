package com.netraenis;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("66133131");


    public static void main(String[] args) {

        boolean quit = true;
        startPhone();
        printActions();

        while (quit) {
            System.out.println("Enter action. (Press 6 to show available options)");
            int userAction = scan.nextInt();
            scan.nextLine();

            switch (userAction) {
                case 0:
                    System.out.println("Phone is shutting down...");
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
                    searchContact();
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

    public static void addNewContact() {
        System.out.println("Enter user name");
        String userName = scan.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scan.nextLine();
        Contact newContact = Contact.createContact(userName, phoneNumber);
        if (myPhone.addNewContact(newContact)) {
            System.out.println("New contact added: name " + userName + " Phone number " + phoneNumber);
        }
        else {
            System.out.println("Contact cannot be saved " + userName + " already exist");
        }
    }

    public static void editContact(){
        //First, let's check if user already exits.
        System.out.println("Enter current contact name: ");
        String currentContact = scan.nextLine();
        Contact existingContact = myPhone.queryContact(currentContact);
        if (existingContact == null) {
            System.out.println("No user with the name " + currentContact + " found");
        } else
        // if the user does exist, proceed with the update.
        {
            System.out.println("Enter the new name");
            String name = scan.nextLine();
            System.out.println("Enter the new number");
            String phoneNumber = scan.nextLine();
            Contact newContact = Contact.createContact(name, phoneNumber);

            if (myPhone.updateContact(existingContact, newContact)) {
                System.out.println("Contact updated");
            } else {
                System.out.println("Error updating contact");
            }
        }
    }

    public static void deleteContact(){
        System.out.println("Enter current contact name: ");
        String currentContact = scan.nextLine();
        Contact existingContact = myPhone.queryContact(currentContact);
        if (existingContact == null) {
            System.out.println("No user with the name " + currentContact + " found");
            return;
        }
        if(myPhone.removeContact(existingContact)) {
            System.out.println("Contact successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }

    public static void searchContact(){
        System.out.println("Enter current contact name: ");
        String currentContact = scan.nextLine();
        Contact existingContact = myPhone.queryContact(currentContact);
        if (existingContact == null) {
            System.out.println("No user with the name " + currentContact + " found");
            return;
        }
        System.out.println("Name: "+ existingContact.getName() + " Phone number: " + existingContact.getPhoneNumber()
                            + " found");
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
