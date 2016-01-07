package com.adrienf.pizza.recipes;

import com.adrienf.pizza.Pizza;
import com.adrienf.pizza.parts.Dough;
import com.adrienf.pizza.parts.Sauce;
import com.adrienf.pizza.parts.Topping;

public class PizzaHawaiBuilder extends Pizza.PizzaBuilder {

    public PizzaHawaiBuilder() {
        super(Dough.PUFF_PASTRY, Sauce.CHILL, Topping.HAM_ANANAS);
    }
}
