package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Shell sort of an array
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        shellSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
            for (int firstUnsortedIndex = gap; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
                int elementToPlace = array[firstUnsortedIndex];
                int j;

                for (j = firstUnsortedIndex; j > 0 && array[j - 1] > elementToPlace; j--) {
                    array[j] = array[j - 1];
                }
                array[j] = elementToPlace;
            }
        }
    }
}
