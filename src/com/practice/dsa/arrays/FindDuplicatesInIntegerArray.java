package com.practice.dsa.arrays;

public class FindDuplicatesInIntegerArray {
    public static void main(String[] args) {
        int[] array = {2,3,1,2,4,3};
        findDuplicates(array);
    }

    private static void findDuplicates(int[] array) {
        for (int i=0; i<array.length;i++){
            if(array[Math.abs(array[i])]>0){
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
            }else{
                System.out.println(Math.abs(array[i])+" is duplicate");
            }
        }
    }
}
