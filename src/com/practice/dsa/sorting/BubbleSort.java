package com.practice.dsa.sorting;

import java.util.Arrays;

/**
 * This Program shows the implementation of Bubble sort of an array
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void bubbleSort(int[] array) {
        for (int lastSortedIndex = array.length-1; lastSortedIndex>0; lastSortedIndex--){
            for (int i =0; i<lastSortedIndex; i++){
                if(array[i]>array[i+1]){
                    swap(array,i, i+1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
