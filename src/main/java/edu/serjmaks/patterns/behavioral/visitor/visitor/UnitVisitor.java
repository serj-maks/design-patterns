package edu.serjmaks.patterns.behavioral.visitor.visitor;

import edu.serjmaks.patterns.behavioral.visitor.model.Commander;
import edu.serjmaks.patterns.behavioral.visitor.model.Sergeant;
import edu.serjmaks.patterns.behavioral.visitor.model.Solder;

public interface UnitVisitor {
    void visit(Solder soldier);

    void visit(Sergeant sergeant);

    void visit(Commander commander);
}
