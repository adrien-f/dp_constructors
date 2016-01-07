package com.adrienf.biscuit;

import java.util.ArrayList;

public class BiscuitFactory {
    private Biscuit biscuit;

    public BiscuitFactory(Biscuit biscuit) {
        this.biscuit = biscuit;
    }

    public Biscuit getBiscuit() {
        return biscuit;
    }

    public void setBiscuit(Biscuit biscuit) {
        this.biscuit = biscuit;
    }

    public ArrayList<Biscuit> makeBiscuitPack() throws CloneNotSupportedException {
        ArrayList<Biscuit> pack = new ArrayList<>();
        for (int i = 0; i < 64; i++) {
            pack.add(this.biscuit.clone());
        }
        return pack;
    }

}
