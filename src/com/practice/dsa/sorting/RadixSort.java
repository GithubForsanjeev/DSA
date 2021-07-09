package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Quick sort of an array
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] array = {4725, 4586, 1330, 8792, 1594, 5729};
        radixSort(array, 10, 4);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void radixSort(int[] array, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(array, i, radix);
        }
    }

    private static void radixSingleSort(int[] array, int position, int radix) {
        int[] countArray = new int[radix];
        for (int value : array) {
            countArray[getDigit(value, radix, position)]++;
        }
        //update count array to fix the correct position of element
        for (int i = 1; i < radix; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] temp = new int[array.length];
        for (int k = array.length - 1; k >= 0; k--) {
            temp[--countArray[getDigit(array[k], radix, position)]] = array[k];
        }

        System.arraycopy(temp, 0, array, 0, array.length);
    }

    private static int getDigit(int value, int radix, int position) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
