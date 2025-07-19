package edu.serjmaks.patterns.behavioral.command.commandImpl;

import edu.serjmaks.patterns.behavioral.command.Bulb;
import edu.serjmaks.patterns.behavioral.command.Command;

public class TurnOn implements Command {
    protected Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOn();
    }
}
