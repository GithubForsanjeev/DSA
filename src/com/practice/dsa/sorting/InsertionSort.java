package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Bubble sort of an array
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void insertionSort(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int elementToPlace = array[firstUnsortedIndex];
            int j;

            for (j = firstUnsortedIndex; j > 0 && array[j - 1] > elementToPlace; j--) {
                array[j] = array[j - 1];
            }
            array[j] = elementToPlace;
        }

    }
}
