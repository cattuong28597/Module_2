package com.codegym.week2.day3.AccessModifier2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(){}
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        String str;
        str = "Name's student is " + this.name + " classes is "+this.classes;
        return str;
    }
}
