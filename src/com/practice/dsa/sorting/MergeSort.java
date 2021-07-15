package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Merge sort of an array
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        mergSort(array, 0, array.length);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void mergSort(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergSort(array, start, mid);
        mergSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {
        if (array[mid - 1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
