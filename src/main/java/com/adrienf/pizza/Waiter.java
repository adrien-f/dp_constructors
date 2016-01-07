package com.adrienf.pizza;

public class Waiter {
    private Pizza.PizzaBuilder pizzaBuilder;
    private Pizza pizza;

    public Waiter() {
    }

    public void setPizzaBuilder(Pizza.PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void buildPizza() {
        this.pizza = this.pizzaBuilder.build();
    }

    public Pizza getPizza() {
        return this.pizza;
    }
}
