package com.thorpe.factory.factory;

import com.thorpe.factory.domain.Property;
import com.thorpe.factory.domain.TrainStation;

import java.math.BigDecimal;

public class TrainStationFactory extends PropertyFactory {
    @Override
    public TrainStation buildProperty(String name, BigDecimal buyPrice) {
        return new TrainStation(name, buyPrice);
    }
}
