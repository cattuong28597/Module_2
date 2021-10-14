package model;

import java.io.Serializable;

public class CustomerInformation implements Serializable {
    private String name;
    private String address;
    private String number;
    private String date;

    public CustomerInformation(String name, String address, String number, String date) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.date = date;
    }

    public CustomerInformation(String raw) {
        String[] fields = raw.split(";");
        this.name = fields[0];
        this.address = fields[1];
        this.number = fields[2];
        this.date = fields[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%d;%s",name,address,number,date);
    }
}
