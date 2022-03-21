package com.netraenis;

public class Main {

    public static void main(String[] args) {

        Bank myBank = new Bank("GTB");

        myBank.addBranch("Ikeja");

        myBank.addCustomer("Ikeja", "Damilare Adeyemo", 1000);
        myBank.addCustomer("Ikeja", "Kunle Owoade", 150.0);
        myBank.addCustomer("Ikeja", "Omosalewa Ayo-Lawal", 50000);

        myBank.addBranch("VI");
        myBank.addCustomer("VI", "Little Finger", 100000);
        myBank.addCustomer("VI", "Sassy Lanista", 8900000);

        myBank.customerTransaction("Ikeja", "Omosalewa Ayo-Lawal", 980054);
        myBank.customerTransaction("VI", "Sassy Lanista", 180054);

//        myBank.listCustomers("Ikeja", true);
//        myBank.listCustomers("VI", true);

        myBank.addBranch("Ejigbo");

        System.out.println("Welcome to " + myBank.getBankName() + ". How can we be of service?");

        if(!myBank.addCustomer("Ejigbo", "Sola", 0)){
            System.out.println("Wahala dey o");
        }

        if(!myBank.addBranch("Ejigbo")){
            System.out.println("There's already a branch in Ejigbo");
        }

        myBank.listCustomers("Ejigbo", true);





    }
}
