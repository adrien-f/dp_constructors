package com.adrienf.biscuit;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	    BiscuitFactory factory = new BiscuitFactory(new Palmito(2));
        ArrayList<Biscuit> palmitoPack = factory.makeBiscuitPack();
        factory.setBiscuit(new Pepito(Chocolate.WHITE));
        ArrayList<Biscuit> pepitoPack = factory.makeBiscuitPack();
        System.out.println("J'ai paquet de " + palmitoPack.size() + " " + palmitoPack.get(0).toString());
        System.out.println("J'ai paquet de " + pepitoPack.size() + " " + pepitoPack.get(0).toString());
    }
}
