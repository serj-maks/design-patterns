package edu.serjmaks.patterns.behavioral.command.command;

// интерфейс, который будет реализовывать каждая комманда
public interface Command {
    void execute();
    void undo();
    void redo();
}
