package edu.serjmaks.patterns.behavioral.visitor.visitor;

import edu.serjmaks.patterns.behavioral.visitor.model.Commander;
import edu.serjmaks.patterns.behavioral.visitor.model.Sergeant;
import edu.serjmaks.patterns.behavioral.visitor.model.Solder;

public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visit(Solder soldier) {
        // Do nothing
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.println("Greetings, " + sergeant);
    }

    @Override
    public void visit(Commander commander) {
        // Do nothing
    }
}
