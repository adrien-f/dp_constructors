package com.debici.bank;

public class Main {

    public static void main(String[] args) {
        Banque banque1 = Banque.getINSTANCE();
        banque1.setCash(100000);
        banque1.setName("Banque 1");
        Banque banque2 = Banque.getINSTANCE();
        banque2.setCash(100000);
        banque2.setName("Banque 2");

        Joueur adrien = new Joueur("Adrien", 50000, "Départ");
        Joueur seb = new Joueur("Sébastien", 50000, "Départ");

        adrien.payer(20000);
        banque1.encaisser(20000);

        seb.payer(10000);
        banque2.encaisser(10000);

        System.out.println("Cash de la banque 1 : " + banque1.getCash());
        System.out.println("Cash de la banque 2 : " + banque2.getCash());
        System.out.println("Cash du premier joueur : " + adrien.getCash());
        System.out.println("Cash du second joueur : " + seb.getCash());







    }
}
