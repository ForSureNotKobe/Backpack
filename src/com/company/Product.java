package com.company;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int ID;
    private String product_Name;
    private int product_Volume;
    private int product_Weight;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public void setProduct_Volume(int product_Volume) {
        this.product_Volume = product_Volume;
    }

    public void setProduct_Weight(int product_Weight) {
        this.product_Weight = product_Weight;
    }

    public int getID() {
        return ID;
    }

    public int getProduct_Volume() {
        return product_Volume;
    }

    public int getProduct_Weight() {
        return product_Weight;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public int compareTo(Product product){
        return (this.getProduct_Weight() - product.getProduct_Weight());
    }
}
