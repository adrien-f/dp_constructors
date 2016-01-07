package com.adrienf.pizza.recipes;

import com.adrienf.pizza.Pizza;
import com.adrienf.pizza.parts.Dough;
import com.adrienf.pizza.parts.Sauce;
import com.adrienf.pizza.parts.Topping;

public class PizzaSpicyBuilder extends Pizza.PizzaBuilder {

    public PizzaSpicyBuilder() {
        super(Dough.PASTRY, Sauce.SPICY, Topping.PEPPERONI_SALAMI);
    }
}
