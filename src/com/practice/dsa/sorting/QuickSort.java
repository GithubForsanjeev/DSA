package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Quick sort of an array
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        quickSort(array, 0, array.length);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        //select first element as pivot
        int pivot = array[start];
        int i = start;
        int j = end;

        while(i<j){

            while(i<j && array[--j]>=pivot);
            if(i<j){
                array[i] = array[j];
            }

            while (i<j && array[++i]<=pivot);
            if(i<j){
                array[j]=array[i];
            }
        }

        array[j] = pivot;
        return j;
    }
}
