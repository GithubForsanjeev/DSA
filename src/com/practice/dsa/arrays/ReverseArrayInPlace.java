package com.practice.dsa.arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int startIndex = 0;
        int endIndex = array.length-1;

        System.out.println("Array before reverse: ");
        printArray(array);
        while(startIndex<endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        System.out.println("Array after reverse: ");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
