package com.codegym.week2.day3.StaticProperty;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getName() {
        return name;
    }
    public String getEngine() {
        return engine;
    }
    public void setName(String n){
        this.name = name;
    }
    public void setEngine(String e) {
        this.engine = engine;
    }
}
