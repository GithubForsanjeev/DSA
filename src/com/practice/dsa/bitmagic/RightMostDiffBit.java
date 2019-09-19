package com.practice.dsa.bitmagic;

/**
 * Given two numbers M and N.
 * find the position of rightmost different bit in binary representation of numbers.
 */
public class RightMostDiffBit {
    public static void main(String[] args) {
        int M = 11;
        int N = 9;
        int result = getRightMostDiffBit(M, N);
        assert 2 == result;
        System.out.printf("%s and %s has the bit diff at position %s from right \n", M, N, result);
    }

    private static int getRightMostDiffBit(int M, int N) {
        return (int) (Math.log((M ^ N) & -(M ^ N)) / Math.log(2.0)) + 1;
    }
}
