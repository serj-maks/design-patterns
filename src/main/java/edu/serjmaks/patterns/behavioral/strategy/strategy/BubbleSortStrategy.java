package edu.serjmaks.patterns.behavioral.strategy.strategy;

import edu.serjmaks.patterns.behavioral.strategy.SortStrategy;

public class BubbleSortStrategy implements SortStrategy {

    @Override
    public void sort(int[] array) {
        System.out.println("bubble sort");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
