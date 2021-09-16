package com.codegym.week2.day5.Abstract.Animal;
import com.codegym.week2.day5.Abstract.Edible.edible;
public class Chicken extends Animal implements edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
