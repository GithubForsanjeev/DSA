package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Counting sort of an array
 */
public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 2, 7, 8, 9, 10, 8};
        //countingSortUnstable(array, 1, 10);
        countingSortStable(array, 1, 10);
        Arrays.stream(array).forEach(System.out::println);

    }

    private static void countingSortUnstable(int[] array, int min, int max) {
        int[] countArray = new int[max - min + 1];
        for (int value : array) {
            countArray[value - min]++;
        }
        //Arrays.stream(countArray).forEach(System.out::println);

        int j = 0;
        for (int k = min; k <= max; k++) {
            while (countArray[k - min] > 0) {
                array[j++] = k;
                countArray[k - min]--;
            }
        }
    }


    private static void countingSortStable(int[] array, int min, int max) {
        int[] countArray = new int[max - min + 1];
        for (int value : array) {
            countArray[value - min]++;
        }

        //update the counting array with the correct position of the element
        for (int j = 1; j < countArray.length; j++) {
            countArray[j] += countArray[j - 1];
        }
        //Arrays.stream(countArray).forEach(System.out::println);

        int[] output = new int[array.length];
        //iterate in reverse to keep the sort stable
        for (int k = array.length - 1; k >= 0; k--) {
            output[countArray[array[k] - 1] - 1] = array[k];
            countArray[array[k] - 1]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
}
