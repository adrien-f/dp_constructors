package com.debici.bank;

import java.util.ArrayList;

/**
 * Created by debici on 07/01/2016.
 */
public class Banque extends Acteur{

    private int cash;
    private ArrayList<Proprietes> listProprietes= new ArrayList<Proprietes>();

    private Banque(){

    }

    private static Banque INSTANCE = new Banque();

    public static Banque getINSTANCE(){
        return INSTANCE;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setName(String name){
        super.setName(name);
    }

    public String getName(){
        return super.getName();
    }

    public void encaisser(int price){
        this.cash += price;
    }

    public void payer(int price){
        this.cash -= price;
    }

    public ArrayList<Proprietes> getListProprietes() {
        return listProprietes;
    }

    public void setListProprietes(ArrayList<Proprietes> listProprietes) {
        this.listProprietes = listProprietes;
    }


}
