package com.adrienf.biscuit;

public class Pepito extends Biscuit {
    private Chocolate chocolate;

    public Pepito(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public void eat() {
        System.out.printf("Aïe Pepito au chocolat %s!", chocolate);
    }

    @Override
    public Biscuit clone() throws CloneNotSupportedException {
        return new Pepito(chocolate);
    }

    @Override
    public String toString() {
        return "Pepito{" +
                "chocolate=" + chocolate +
                '}';
    }
}
