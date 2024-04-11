package edu.serjmaks.patterns.behavioral.visitor;

import edu.serjmaks.patterns.behavioral.visitor.model.Commander;
import edu.serjmaks.patterns.behavioral.visitor.model.Sergeant;
import edu.serjmaks.patterns.behavioral.visitor.model.Solder;
import edu.serjmaks.patterns.behavioral.visitor.visitor.CommanderVisitor;
import edu.serjmaks.patterns.behavioral.visitor.visitor.SergeantVisitor;
import edu.serjmaks.patterns.behavioral.visitor.visitor.SolderVisitor;

public class Demo {
    public static void main(String[] args) {
        Commander commander = new Commander(
                new Sergeant(
                        new Solder(), new Solder()
                ),
                new Sergeant(
                        new Solder(), new Solder()
                )
        );

        commander.accept(new SolderVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }
}
