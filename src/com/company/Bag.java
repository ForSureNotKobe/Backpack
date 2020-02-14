package com.company;

import java.util.ArrayList;

public class Bag {

    Bag (int bagNumber){
        setBagNumber(bagNumber);
    }

    private int bagNumber = 0;
    private int weightEndurance = 10;
    private int Capacity = 10;
    private ArrayList<Product> packerList = new ArrayList<>();

    public int getCapacity() {
        return Capacity;
    }

    public int getWeightEndurance() {
        return weightEndurance;
    }

    public ArrayList<Product> getPackerList() {
        return packerList;
    }

    public int getBagNumber() {
        return bagNumber;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void setWeightEndurance(int weightEndurance) {
        this.weightEndurance = weightEndurance;
    }

    public void setBagNumber(int bagNumber) {
        this.bagNumber = bagNumber;
    }

    public void addProductToBag(Product product){
        this.packerList.add(product);
    }

    public void listAllProductsInBag()
    {
        for (Product product : packerList)
        {
            System.out.println(product.getProduct_Name());
        }
    }
}
