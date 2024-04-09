package edu.serjmaks.patterns.creational.builder;

import edu.serjmaks.patterns.creational.builder.builder.Builder;
import edu.serjmaks.patterns.creational.builder.model.car.Type;
import edu.serjmaks.patterns.creational.builder.model.component.Engine;
import edu.serjmaks.patterns.creational.builder.model.component.Gps;
import edu.serjmaks.patterns.creational.builder.model.component.Transmission;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built
 */
public class Director {

    public void createSedan(Builder builder) {
        builder.setCarType(Type.SEDAN);
        builder.setSeats(4);
        builder.setEngine(new Engine());
        builder.setTransmission(Transmission.MECHANIC);
        builder.setGps(new Gps());
    }
}
