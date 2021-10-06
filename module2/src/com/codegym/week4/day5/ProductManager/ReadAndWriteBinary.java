package com.codegym.week4.day5.ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinary {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        Product pr1 = new Product(1, "iphone7", "Apple", 10000,"black");
        Product pr2 = new Product(2, "iphone8", "Apple", 10000,"black");
        Product pr3 = new Product(3, "GalaxyS", "Samsung", 10000,"black");
        Product pr4 = new Product(4, "GalaxyTab", "Samsung", 10000,"black");
        Product pr5 = new Product(5, "XiaoMi", "XiaoMi", 10000,"black");
        Product pr6 = new Product(6, "OppoR1", "Oppo", 10000,"black");

        List<Product> products = new ArrayList<>();
        products.add(pr1);
        products.add(pr2);
        products.add(pr3);
        products.add(pr4);
        products.add(pr5);
        products.add(pr6);

        writeToFile("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day5\\ProductManager\\product.txt", products);
        List<Product> productDataFromFile = readDataFromFile("D:\\Module_2\\module2\\src\\com\\codegym\\week4\\day5\\ProductManager\\product.txt");
        for (Product p: productDataFromFile) {
            System.out.println(p);
        }
    }
}
