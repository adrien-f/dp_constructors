package com.debici.bank;

/**
 * Created by debici on 07/01/2016.
 */
public class Acteur{
    private String name;

    public Acteur(){
        this.name = "";
    }

    public Acteur(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
