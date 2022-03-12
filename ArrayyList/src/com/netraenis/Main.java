package com.netraenis;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();

        while (!quit) {
            System.out.println("Enter your choice");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 3:
                    modifyGroceryItem();
                    break;
                case 4:
                    removeGroceryItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 2:
                    addGroceryItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstruction() {
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add item to the list");
        System.out.println("\t 3 - To modify an item");
        System.out.println("\t 4 - To remove an item");
        System.out.println("\t 5 - To search for an item");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addGroceryItem() {
        System.out.println("Type the item you'd like to add to the list");
        groceryList.addItem(scan.nextLine());
    }

    public static void modifyGroceryItem() {
        System.out.println("Enter the current item name: ");
        String current = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter the new item name:");
        String newItem = scan.nextLine();

        groceryList.modifyGrocery(current, newItem);
    }

    public static void removeGroceryItem() {
        System.out.println("Enter Item name");
        String itemName = scan.nextLine();
        scan.nextLine();
        groceryList.removeItem(itemName);
    }

    public static void searchItem() {
        System.out.println("What item are you looking for on the list?");
        String searchedItem = scan.nextLine();
        if(groceryList.onFile(searchedItem) ) {
            System.out.println("Searched Item Found!");
        }else {
            System.out.println("Gobe! Item nor dey list");
        }
    }
}
