package edu.serjmaks.patterns.behavioral.visitor.model;

import edu.serjmaks.patterns.behavioral.visitor.visitor.UnitVisitor;

public class Solder extends Unit {
    public Solder(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "solder";
    }
}
