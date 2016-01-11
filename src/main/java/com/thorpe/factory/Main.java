package com.thorpe.factory;


import com.thorpe.factory.domain.Property;
import com.thorpe.factory.factory.EECompanyFactory;
import com.thorpe.factory.factory.PlotFactory;
import com.thorpe.factory.factory.TrainStationFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        ArrayList<Property> properties = new ArrayList<>();
        PlotFactory plotFactory = new PlotFactory();
        EECompanyFactory eeCompanyFactory = new EECompanyFactory();
        TrainStationFactory trainStationFactory = new TrainStationFactory();

        properties.add(plotFactory.buildProperty("Terrain #1", new BigDecimal(2500000)));
        properties.add(plotFactory.buildProperty("Terrain #2", new BigDecimal(500000)));
        properties.add(trainStationFactory.buildProperty("Gare #1", new BigDecimal(100000000)));
        properties.add(eeCompanyFactory.buildProperty("EDF", new BigDecimal(123000000)));

        for (Property property : properties) {
            System.out.println(property.toString());
        }
    }
}
