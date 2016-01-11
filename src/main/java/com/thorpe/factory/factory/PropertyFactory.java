package com.thorpe.factory.factory;

import com.thorpe.factory.domain.Property;

import java.math.BigDecimal;

public abstract class PropertyFactory {
    public abstract Property buildProperty(String name, BigDecimal buyPrice);
}
