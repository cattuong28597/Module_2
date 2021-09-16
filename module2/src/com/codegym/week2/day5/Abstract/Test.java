package com.codegym.week2.day5.Abstract;

import com.codegym.week2.day5.Abstract.Animal.Animal;
import com.codegym.week2.day5.Abstract.Animal.Chicken;
import com.codegym.week2.day5.Abstract.Animal.Tiger;
import com.codegym.week2.day5.Abstract.Edible.edible;
import com.codegym.week2.day5.Abstract.Fruit.Fruit;
import com.codegym.week2.day5.Abstract.Fruit.Apple;
import com.codegym.week2.day5.Abstract.Fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }

}

