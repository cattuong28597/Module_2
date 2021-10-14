package model;

import java.io.Serializable;

public class Book {
    private String name;
    private String author;
    private long price;
    private int quantity;

    public Book(String name, String author, long price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public Book(String raw) {
        String[] fields = raw.split(";");
        this.name = fields[0];
        this.author = fields[1];
        this.price = Long.parseLong(fields[2]);
        this.quantity = Integer.parseInt(fields[3]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%d;%d", name, author, price, quantity);
    }

}
