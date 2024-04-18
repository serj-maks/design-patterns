package edu.serjmaks.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

    private final List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int size() {
        return children.size();
    }

    public void print() {
        printThisBefore();
        children.forEach(letter -> letter.print());
        printThisAfter();
    }

    protected void printThisBefore() {

    }

    protected void printThisAfter() {

    }
}
