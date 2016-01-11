package com.thorpe.factory.factory;

import com.thorpe.factory.domain.EECompany;
import com.thorpe.factory.domain.Plot;
import com.thorpe.factory.domain.Property;

import java.math.BigDecimal;

public class PlotFactory extends PropertyFactory {
    @Override
    public Plot buildProperty(String name, BigDecimal buyPrice) {
        return new Plot(name, buyPrice);
    }
}
