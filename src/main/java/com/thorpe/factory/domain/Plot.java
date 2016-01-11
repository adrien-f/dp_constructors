package com.thorpe.factory.domain;

import java.math.BigDecimal;

public class Plot extends Property {

    public Plot(String name, BigDecimal buyPrice) {
        super(name, buyPrice);
    }

    @Override
    public String toString() {
        return "Je calcule le loyer d'un terrain";
    }
}
