package edu.serjmaks.patterns.structural.composite;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        words.forEach(word -> add(word));
    }

    @Override
    protected void printThisAfter() {
        System.out.println(".");
    }
}
