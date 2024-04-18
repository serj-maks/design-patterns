package edu.serjmaks.patterns.structural.facade;

import edu.serjmaks.patterns.structural.facade.computer.*;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ComputerFacade {

    private final List<Computer> computerParts;

    public ComputerFacade() {
        computerParts = List.of(
                new Cpu(),
                new Gpu(),
                new Keyboard(),
                new Mouse(),
                new PowerAdapter(),
                new Ram(),
                new Screen()
        );
    }

    public void turnOn() {
        computerParts.forEach(part -> part.start());
    }
}
