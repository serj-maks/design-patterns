package edu.serjmaks.patterns.creational.builder.builder;

import edu.serjmaks.patterns.creational.builder.model.car.Car;
import edu.serjmaks.patterns.creational.builder.model.car.Type;
import edu.serjmaks.patterns.creational.builder.model.component.Engine;
import edu.serjmaks.patterns.creational.builder.model.component.Gps;
import edu.serjmaks.patterns.creational.builder.model.component.Transmission;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
public class CarBuilder implements Builder {
    Type type;
    int seats;
    Engine engine;
    Transmission transmission;
    Gps gps;

    @Override
    public void setCarType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGps(Gps gps) {
        this.gps = gps;
    }

    public Car build() {
        return new Car(type, seats, engine, transmission, gps);
    }
}
