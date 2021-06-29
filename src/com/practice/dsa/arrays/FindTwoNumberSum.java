package com.practice.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTwoNumberSum {

    public static void main(String[] args) {
        Integer[] array ={3, 5,-4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        //int[] result = get2NumberSumSol1(array, targetSum); // Time: O(n^2) | Space: O(1)
        //int[] result = get2NumberSumSol2(array, targetSum); // Time: O(n) | Space: O(n)
        int[] result = get2NumberSumSol3(array, targetSum); // Time: O(nlog(n)) | Space: O(1)

        for (int k=0; k<result.length; k++){
            System.out.println(result[k]);
        }
    }

    /**
     * Finding 2 numbers  whose sum is equal to the target sum
     * Time: O(n^2) | Space: O(1)
     * @param array
     * @param targetSum
     * @return
     */
    private static int[] get2NumberSumSol1(Integer[] array, int targetSum) {
        int[] result = new int [2];
        for(int i=0; i<array.length; i++){
            int firstNum = array[i];
            for(int j=i+1; j<array.length-1; j++){
                int secondNum = array[j];
                if(firstNum+secondNum == targetSum){
                    result[0] = firstNum;
                    result[1] = secondNum;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * Finding 2 numbers  whose sum is equal to the target sum
     * Time: O(n) | Space: O(n)
     * @param array
     * @param targetSum
     * @return
     */
    private static int[] get2NumberSumSol2(Integer[] array, int targetSum) {
        int[] result = new int [2];

        List<Integer> elements= new ArrayList<>();
        for(int i=0; i<array.length; i++) {
            int subtract = targetSum-array[i];
            if(elements.contains(subtract)){
                result[0] = array[i];
                result[1] = subtract;
                return result;
            }else{
                elements.add(array[i]);
            }
        }
        return result;
    }

    /**
     * Finding 2 numbers  whose sum is equal to the target sum
     * Time: O(nlog(n)) | Space: O(1)
     * @param array
     * @param targetSum
     * @return
     */
    private static int[] get2NumberSumSol3(Integer[] array, int targetSum) {
        int[] result = new int [2];
        Arrays.sort(array); //nlogn
        int start =0;
        int end = array.length-1;
        while (start<end){
            if(array[start]+array[end]==targetSum){
                result[0]= array[start];
                result[1] = array[end];
                return result;
            }else if(array[start]+array[end]< targetSum){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}



