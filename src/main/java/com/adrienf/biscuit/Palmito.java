package com.adrienf.biscuit;

public class Palmito extends Biscuit {

    private int ears;

    public Palmito(int ears) {
        this.ears = ears;
    }

    @Override
    public void eat() {
        System.out.printf("Palmito, ça se croque par ses %d oreilles !", ears);
    }

    @Override
    public Biscuit clone() throws CloneNotSupportedException {
        return new Palmito(ears);
    }

    @Override
    public String toString() {
        return "Palmito{" +
                "ears=" + ears +
                '}';
    }
}
