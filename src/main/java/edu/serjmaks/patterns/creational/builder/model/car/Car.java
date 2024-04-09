package edu.serjmaks.patterns.creational.builder.model.car;

import edu.serjmaks.patterns.creational.builder.model.component.Engine;
import edu.serjmaks.patterns.creational.builder.model.component.Gps;
import edu.serjmaks.patterns.creational.builder.model.component.Transmission;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public class Car {
    Type type;
    int seats;
    Engine engine;
    Transmission transmission;
    Gps gps;
}
