package edu.serjmaks.patterns.behavioral.strategy;

import edu.serjmaks.patterns.behavioral.strategy.model.IntArray;
import edu.serjmaks.patterns.behavioral.strategy.strategy.SelectionSortStrategy;

import java.util.Random;

class Demo {
    public static void main(String[] args) {
        IntArray array = new IntArray(10);

        Random random = new Random();
        for (int i = 0; i < array.length(); i++) {
            array.set(i, random.nextInt(100));
        }

        System.out.println(array);

        // default sort (was set into 'IntArray' constructor)
        array.sort();
        System.out.println(array);

        array.setSortStrategy(new SelectionSortStrategy());
        array.sort();
        System.out.println(array);
    }
}
