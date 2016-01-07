package com.adrienf.biscuit;

public abstract class Biscuit implements Cloneable {
    @Override
    public abstract Biscuit clone() throws CloneNotSupportedException;

    public abstract void eat();
}
