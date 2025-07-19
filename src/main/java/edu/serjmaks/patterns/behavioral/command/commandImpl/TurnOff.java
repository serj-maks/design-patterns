package edu.serjmaks.patterns.behavioral.command.commandImpl;

import edu.serjmaks.patterns.behavioral.command.Bulb;
import edu.serjmaks.patterns.behavioral.command.Command;

public class TurnOff implements Command {
    protected Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOff();
    }
}
