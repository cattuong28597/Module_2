package com.codegym.week5.day5.TemplateMethod;

public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredient() {
        System.out.println("Getting burgurs, buns and frech fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanup() {
        System.out.println("Throwing away paper plates");
    }
}
