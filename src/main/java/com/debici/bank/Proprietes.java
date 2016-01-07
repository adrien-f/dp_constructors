package com.debici.bank;

/**
 * Created by debici on 07/01/2016.
 */
public class Proprietes {
    private String name;
    private int price;

    public Proprietes(){
        this.name = "";
        this.price = 0;
    }

    public Proprietes(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
