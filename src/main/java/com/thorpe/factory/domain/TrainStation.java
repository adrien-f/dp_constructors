package com.thorpe.factory.domain;

import java.math.BigDecimal;

public class TrainStation extends Property {

    public TrainStation(String name, BigDecimal buyPrice) {
        super(name, buyPrice);
    }

    @Override
    public String toString() {
        return "Je calcule le loyer d'une gare";
    }
}
