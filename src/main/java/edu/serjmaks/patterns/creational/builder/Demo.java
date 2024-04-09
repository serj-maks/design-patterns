package edu.serjmaks.patterns.creational.builder;

import edu.serjmaks.patterns.creational.builder.builder.CarBuilder;
import edu.serjmaks.patterns.creational.builder.model.car.Car;
import edu.serjmaks.patterns.creational.builder.model.car.Type;
import edu.serjmaks.patterns.creational.builder.model.component.Engine;
import edu.serjmaks.patterns.creational.builder.model.component.Gps;
import edu.serjmaks.patterns.creational.builder.model.component.Transmission;

public class Demo {
    public static void main(String[] args) {
        // create via director class
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.createSedan(carBuilder);
        Car sedan = carBuilder.build();
        System.out.println(sedan.getType());

        // create manually
        carBuilder.setCarType(Type.COUPE);
        carBuilder.setSeats(2);
        carBuilder.setEngine(new Engine());
        carBuilder.setTransmission(Transmission.AUTO);
        carBuilder.setGps(new Gps());
        Car coupe = carBuilder.build();
        System.out.println(coupe.getType());

    }
}
