package com.netraenis;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        //Get Grocery size first
        System.out.println("There are " + groceryList.size() + " items on your list");
        for(int i=0; i < groceryList.size(); i++)
            System.out.println("Item " + (i+1) + ": " + groceryList.get(i));
    }

    public void modifyGrocery(String current, String newName) {
        int position = groceryList.indexOf(current);
        if(position >= 0) {
            modifyGrocery(position, newName);
        }
    }
    private void modifyGrocery(int position, String item){
        groceryList.set(position, item);
        System.out.println("The grocery item in " + position+1 + " has been modified");
    }

    public void removeItem(String item){
        int position = findItem(item);
        removeItem(position);
    }
    private void removeItem(int position) {
        groceryList.remove(position);
        //String theItem = groceryList.get(position);
        System.out.println("The item has been removed");
    }

    public int findItem(String item) {
        // boolean itExists = groceryList.contains(item);
        return groceryList.indexOf(item);
    }

    public boolean onFile(String item) {
        int position = findItem(item);
        if(position >= 0){
            return true;
        } return false;
    }



}
