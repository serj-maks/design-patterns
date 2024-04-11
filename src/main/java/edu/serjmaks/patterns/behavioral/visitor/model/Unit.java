package edu.serjmaks.patterns.behavioral.visitor.model;

import edu.serjmaks.patterns.behavioral.visitor.visitor.UnitVisitor;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Arrays;

@FieldDefaults(makeFinal=true, level= AccessLevel.PRIVATE)
public abstract class Unit {
    Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children)
                .forEach(child -> child.accept(visitor));
    }
}
