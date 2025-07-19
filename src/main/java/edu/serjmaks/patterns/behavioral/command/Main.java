package edu.serjmaks.patterns.behavioral.command;

import edu.serjmaks.patterns.behavioral.command.commandImpl.TurnOff;
import edu.serjmaks.patterns.behavioral.command.commandImpl.TurnOn;

// client
// ты (client) включаешь (command) при помощи пульта (invoker) лампочку (receiver)
public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        TurnOn turnOn = new TurnOn(bulb);
        TurnOff turnOff = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();
    }
}
