package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Bubble sort of an array
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void selectionSort(int[] array) {
        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            int max = 0;
            for (int j = 1; j <= lastIndex; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            swap(array, lastIndex, max);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
