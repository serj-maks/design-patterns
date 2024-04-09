package edu.serjmaks.patterns.creational.builder.builder;

import edu.serjmaks.patterns.creational.builder.model.car.Type;
import edu.serjmaks.patterns.creational.builder.model.component.Engine;
import edu.serjmaks.patterns.creational.builder.model.component.Gps;
import edu.serjmaks.patterns.creational.builder.model.component.Transmission;

public interface Builder {
    void setCarType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setGps(Gps gps);
}
