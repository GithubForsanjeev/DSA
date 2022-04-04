package com.practice.dsa.misc;

import java.util.ArrayList;

/**
 * Print concentric rectangular pattern in a 2d matrix.
 *
 * Example 1:
 *
 * Input: n = 4.
 *
 * Output:
 *
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 */
public class PrettyPrint {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>matToPrint = prettyPrint(4);
        printMatrix(matToPrint);
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matToPrint) {
        for (ArrayList<Integer> integers : matToPrint) {
            for (int j = 0; j < matToPrint.get(0).size(); j++) {
                System.out.print(integers.get(j) + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> prettyPrint(int n) {
        int matrixSize = 2*n-1;
        ArrayList<ArrayList<Integer>> solution = new ArrayList<>();
        for(int i=0; i<matrixSize;i++){
            ArrayList<Integer> row= new ArrayList<>();
            for(int j=0;j<matrixSize;j++){
                row.add(Math.max(Math.abs(i-matrixSize/2), Math.abs(j-matrixSize/2))+1);
            }
            solution.add(row);
        }
        return solution;
    }
}
