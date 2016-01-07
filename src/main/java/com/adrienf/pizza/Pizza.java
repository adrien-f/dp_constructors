package com.adrienf.pizza;

import com.adrienf.pizza.parts.Dough;
import com.adrienf.pizza.parts.Sauce;
import com.adrienf.pizza.parts.Topping;

public class Pizza {
    private Dough dough;
    private Sauce sauce;
    private Topping topping;

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Topping getTopping() {
        return topping;
    }

    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", topping=" + topping +
                '}';
    }

    public static class PizzaBuilder {

        private Dough dough;
        private Sauce sauce;
        private Topping topping;

        public PizzaBuilder() {
        }

        public PizzaBuilder(Dough dough, Sauce sauce, Topping topping) {
            this.dough = dough;
            this.sauce = sauce;
            this.topping = topping;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

}
