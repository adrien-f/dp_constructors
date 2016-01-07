package com.debici.bank;

import java.util.ArrayList;

/**
 * Created by debici on 07/01/2016.
 */
public class Joueur extends Acteur {
    private int cash;
    private String placeOnBoard;
    private ArrayList<Proprietes> listProprietes= new ArrayList<Proprietes>();


    public Joueur(String name, int cash, String placeOnBoard){
        super.setName(name);
        this.cash = cash;
        this.placeOnBoard = placeOnBoard;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getPlaceOnBoard() {
        return placeOnBoard;
    }

    public void setPlaceOnBoard(String placeOnBoard) {
        this.placeOnBoard = placeOnBoard;
    }


    public ArrayList<Proprietes> getListProprietes() {
        return listProprietes;
    }

    public void setListProprietes(ArrayList<Proprietes> listProprietes) {
        this.listProprietes = listProprietes;
    }

    public void encaisser(int price){
        this.cash += price;
    }

    public void payer(int price){
        this.cash -= price;
    }

    public double move(){
        return Math.random() * ( 12 - 1 );
    }


}
