package com.adrienf.pizza;

import com.adrienf.pizza.recipes.PizzaHawaiBuilder;
import com.adrienf.pizza.recipes.PizzaSpicyBuilder;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        System.out.println("Hello, what kind of pizza do you want?");
        System.out.println("I need a hawai pizza !");
        waiter.setPizzaBuilder(new PizzaHawaiBuilder());
        System.out.println("Cooking...");
        waiter.buildPizza();
        System.out.println("Here's your pizza:");
        System.out.println(waiter.getPizza().toString());
        System.out.println("Thanks you, bye!");
        System.out.println("Hello, what kind of pizza do you want?");
        System.out.println("I need a spicy pizza !");
        waiter.setPizzaBuilder(new PizzaSpicyBuilder());
        System.out.println("Cooking...");
        waiter.buildPizza();
        System.out.println("Here's your pizza:");
        System.out.println(waiter.getPizza().toString());
    }
}
