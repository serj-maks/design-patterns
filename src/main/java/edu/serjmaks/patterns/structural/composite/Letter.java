package edu.serjmaks.patterns.structural.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Letter extends LetterComposite {

    private final char character;

    @Override
    protected void printThisBefore() {
        System.out.println(character);
    }
}
