package com.thorpe.factory.domain;

import java.math.BigDecimal;

public class EECompany extends Property {
    public EECompany(String name, BigDecimal buyPrice) {
        super(name, buyPrice);
    }

    @Override
    public String toString() {
        return "Je calcule le loyer d'une compagnie d'électricité/eau";
    }
}
