package edu.serjmaks.patterns.behavioral.command;

import edu.serjmaks.patterns.behavioral.command.command.TurnOff;
import edu.serjmaks.patterns.behavioral.command.command.TurnOn;

// client
// ты (client) включаешь (command) при помощи пульта (invoker) лампочку (receiver)
public class Demo {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();
        TurnOn turnOn = new TurnOn(bulb);
        TurnOff turnOff = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(turnOn);
        remoteControl.submit(turnOff);
    }
}
