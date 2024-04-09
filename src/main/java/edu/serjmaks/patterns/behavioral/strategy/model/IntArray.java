package edu.serjmaks.patterns.behavioral.strategy.model;

import edu.serjmaks.patterns.behavioral.strategy.strategy.BubbleSortStrategy;
import edu.serjmaks.patterns.behavioral.strategy.SortStrategy;

import java.util.Arrays;

public class IntArray {

    private final int[] intArray;
    private SortStrategy sortStrategy;

    public IntArray(int capacity) {
        intArray = new int[capacity];

        // set default sort strategy
        this.sortStrategy = new BubbleSortStrategy();
    }

    public void set(int index, int value) {
        intArray[index] = value;
    }

    public int length() {
        return intArray.length;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort() {
        sortStrategy.sort(intArray);
    }

    @Override
    public String toString() {
        return Arrays.toString(intArray);
    }
}
