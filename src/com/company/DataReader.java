package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class DataReader {

    String csvFile = "C:/Important Stuff/Plecakowy/danePlecakowy.csv"; //here enter the path to CSV file to read from
    String line = "";
    String csvSplitBy = ";";
    ArrayList<Product> listOfProducts = new ArrayList<>();
    int i=0;

    public ArrayList<Product> getListOfProducts() {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                Product product = new Product();
                product.setID(i);
                product.setProduct_Name(data[1]);
                product.setProduct_Weight(parseInt(data[2]));
                product.setProduct_Volume(parseInt(data[3]));
                listOfProducts.add(product);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfProducts;
    }
}
