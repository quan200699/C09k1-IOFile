package com.quan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileMain {
    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "IPhone 13"));
        products.add(new Product(2, "IPhone 12"));
        products.add(new Product(3, "IPhone 11"));
        products.add(new Product(4, "IPhone X"));
        products.add(new Product(5, "IPhone 8"));
    }

    public static void main(String[] args) {
        writeToFile();
        products.add(new Product(6, "IPhone 7"));
        writeToFile();
        readFile();
    }

    private static List<Product> readFile() {
        try {
            FileReader fileReader = new FileReader("products.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            List<Product> newProduct = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String products[] = line.split(",");
                Product newProduct1 = new Product(Integer.parseInt(products[0]), products[1]);
                newProduct.add(newProduct1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    private static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("products.txt");
            for (Product product : products) {
                String productLine = product.getId() + "," + product.getName() + "\n";
                fileWriter.write(productLine);
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
