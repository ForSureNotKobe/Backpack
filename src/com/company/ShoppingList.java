package com.company;

import java.util.ArrayList;
import java.util.Random;

public class ShoppingList {
    private int ID;
    private int Quantity;
    private boolean isPacked;
    private boolean triedToPack;

    public int getID() {
        return ID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public boolean isTriedToPack() {
        return triedToPack;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public void setPacked(boolean packed) {
        isPacked = packed;
    }

    public void setTriedToPack(boolean triedToPack) {
        this.triedToPack = triedToPack;
    }

    public static ArrayList<ShoppingList> getShoppingList() {

        ArrayList<ShoppingList> shoppingList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 5; i++)
        {
            int quantity = (rand.nextInt(4));
            while (quantity > 0){
                ShoppingList product = new ShoppingList();
                product.setID(i);
                shoppingList.add(product);
                quantity--;
            }
        }
        return shoppingList;
    }
}
