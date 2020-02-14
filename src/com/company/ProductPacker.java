package com.company;

import java.util.*;


public class ProductPacker {

    ArrayList<ShoppingList> shoppingList = new ArrayList<>();
    ArrayList<Product> listOfProducts = new ArrayList<>();
    DataReader dr = new DataReader();

    int BagEndurance = 10;


    public void packProducts() {
        shoppingList = ShoppingList.getShoppingList();  //get all bought products listed separately
        listOfProducts = dr.getListOfProducts();        //get all products that are known

        Collections.sort(listOfProducts);       //sort list by the weight
        Collections.reverse(listOfProducts);    //invert it so heaviest is first


        int bagCounter = 1;
        int bagWeight = 0;
        int totalWeight = 0;

        for (ShoppingList item : shoppingList)
        {
            System.out.println("Weight: " + (item.getID()+1) );
            totalWeight = totalWeight + (item.getID()+1);
        }

        int prodCounter = 0;

        while (prodCounter != shoppingList.size()) {
            if (bagWeight == BagEndurance){
                bagWeight = 0;
                bagCounter++;
            }
            for (Product listProduct : listOfProducts) {
                for (ShoppingList cartProduct : shoppingList) {
                    if (cartProduct.isPacked()) continue;
                    if (cartProduct.getID() == listProduct.getID()) {
                        if (bagWeight + listProduct.getProduct_Weight() <= BagEndurance) {
                            bagWeight = bagWeight + listProduct.getProduct_Weight();
                            cartProduct.setPacked(true);
                            prodCounter++;
                        } else if (cartProduct.isTriedToPack()){
                            bagWeight = 0;
                            bagCounter++;
                            bagWeight = bagWeight + listProduct.getProduct_Weight();
                            cartProduct.setPacked(true);
                            prodCounter++;
                        }
                        else cartProduct.setTriedToPack(true);
                    }
                }
            }
        }

        System.out.println("Number of used bags is " + bagCounter);
        System.out.println("Total weight of products is " + totalWeight);
    }


}
