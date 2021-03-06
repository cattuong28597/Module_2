package com.codegym.week5.day5.TemplateMethod;

public abstract class Meal {
    public final void doMeal() {
        prepareIngredient();
        cook();
        eat();
        cleanup();
    }

    public abstract void prepareIngredient();

    public abstract void cook();

    public void eat() {
        System.out.println("Mmm, that's good");
    }

    public abstract void cleanup();
}
