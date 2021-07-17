package com.practice.dsa.arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "restful";
        String str2 = "frestul";

        System.out.println("Are strings " + str1 + " and " + str2 + " are anagram: " + isAnagram(str1.toCharArray(), str2.toCharArray()));

    }

    private static boolean isAnagram(char[] str1, char[] str2) {
        if (str1.length != str2.length)
            return false;

        //O(NlogN)
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i])
                return false;
        }

        return true;
    }
}
