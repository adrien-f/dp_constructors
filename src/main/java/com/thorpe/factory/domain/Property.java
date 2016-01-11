package com.thorpe.factory.domain;

import java.math.BigDecimal;

public abstract class Property {

    private String name;
    private BigDecimal buyPrice;

    public Property(String name, BigDecimal buyPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }
}
