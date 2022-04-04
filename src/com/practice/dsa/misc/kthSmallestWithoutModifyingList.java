package com.practice.dsa.misc;

import java.util.Arrays;
import java.util.List;

/**
 * Find the kth smallest element in an unsorted array of non-negative no duplicate integers .
 *
 * Example:
 *
 * A : [2 1 4 3 ]
 * k : 3
 *
 * answer : 3
 *
 * You are not allowed to modify the array ( The array is read only ).
 */
public class kthSmallestWithoutModifyingList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 4, 3);
        int k = 3;
        int kthSmallestElement = kthSmallest(list,k);
        System.out.println(k+" element is "+ kthSmallestElement);
    }

    public static int kthSmallest(final List<Integer> list, int k) {
        if (k > list.size()) {
            System.out.println("k is bigger that the size of list");
            return Integer.MAX_VALUE;
        }
        //first get the smallest number in list
        int res = getSmallest(list);
        int count = 1;
        while (count<k){
            res = getNextBig(list,res);
            count++;
        }

        return list.get(res);
    }

    public static int getNextBig(List<Integer> list, int currentSmallest) {
        int nextBig = -1;
        for(int i=0; i<list.size();i++){
            if(i==currentSmallest || list.get(i)<list.get(currentSmallest)){
                continue;
            }
            if(nextBig ==-1){
                nextBig = i;
                continue;
            }
            if(list.get(i)>=list.get(currentSmallest) && list.get(i)<list.get(nextBig) ){
                nextBig = i;
            }
        }
        return nextBig;
    }

    public static int getSmallest(List<Integer> list){
        int smallest = 0;
        for(int i=1;i<list.size();i++){
            if(list.get(smallest)> list.get(i)){
                smallest = i;
            }
        }
        return smallest;
    }
}
