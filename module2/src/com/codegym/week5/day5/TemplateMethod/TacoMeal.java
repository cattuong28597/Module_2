package com.codegym.week5.day5.TemplateMethod;

public class TacoMeal extends Meal{

    @Override
    public void prepareIngredient() {
        System.out.println("Getting ground beef and shells");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void eat() {
        System.out.println("The Taco are tasty");
    }

    @Override
    public void cleanup() {
        System.out.println("Doing the dishes");
    }
}
