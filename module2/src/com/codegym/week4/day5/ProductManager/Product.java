package com.codegym.week4.day5.ProductManager;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String manufacturer;
    private long price;
    private String color;

    public Product() {

    }

    public Product(int code, String name, String manufacturer,long price, String color) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
