package edu.serjmaks.patterns.behavioral.visitor.model;

import edu.serjmaks.patterns.behavioral.visitor.visitor.UnitVisitor;

public class Commander extends Unit {

    public Commander(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor) {
        visitor.visit(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return "commander";
    }
}
