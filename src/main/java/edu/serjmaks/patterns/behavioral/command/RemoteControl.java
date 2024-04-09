package edu.serjmaks.patterns.behavioral.command;


import edu.serjmaks.patterns.behavioral.command.command.Command;

// invoker
// вызывающий, с которым будет взаимодействовать клиент для обработки команд
public class RemoteControl {

    public void submit(Command command) {
        command.execute();
    }
}
