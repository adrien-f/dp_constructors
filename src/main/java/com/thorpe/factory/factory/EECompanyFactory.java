package com.thorpe.factory.factory;

import com.thorpe.factory.domain.EECompany;
import com.thorpe.factory.domain.Property;

import java.math.BigDecimal;

public class EECompanyFactory extends PropertyFactory {
    @Override
    public EECompany buildProperty(String name, BigDecimal buyPrice) {
        return new EECompany(name, buyPrice);
    }
}
