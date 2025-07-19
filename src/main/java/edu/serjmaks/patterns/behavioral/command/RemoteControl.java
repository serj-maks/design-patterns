package edu.serjmaks.patterns.behavioral.command;

// invoker
// вызывающий, с которым будет взаимодействовать клиент для обработки команд
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
       this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
