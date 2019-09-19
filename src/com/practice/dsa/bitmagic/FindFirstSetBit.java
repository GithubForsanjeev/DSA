package com.practice.dsa.bitmagic;

/**
 * Given an integer an N. The task is to print the position of first set bit found from right side
 * in the binary representation of the number.
 */
public class FindFirstSetBit {
    public static void main(String[] args) {
        int input1 = 18;
        int result1 = getFirstSetBit1(input1);
        assert 2 == result1;
        System.out.printf("%s has the first set bit at position %s \n",input1,result1);

        int input2 = 6;
        int result2 = getFirstSetBit2(input2);
        assert 2 == result2;
        System.out.printf("%s has the first set bit at position %s \n",input2,result2);
    }
    private static int getFirstSetBit1(int input) {
        int count = 0;
        while (true) {
            if ((input & (1 << count)) == 0)
                count++;
            else
                return count+1;
        }
    }

    private static int getFirstSetBit2(int input) {
        // logic here is :
        // when we do '&' operation it gives the number which has
        // binary representation where one bit set from right
        // 6 -> 0110 and -6 -> 1010
        //    0110
        //  & 1010
        // ----------
        //    0010
        // if we see the decimal representation
        //    ...  16   8    4    2    1
        //    ... 2^4  2^3  2^2  2^1  2^0
        //  so if take the log base 2 of the decimal value it gives the position of the set bit
        // as power starts with 0 , add 1 to the result return
        return ((int)(Math.log(input & -input)/Math.log(2.0))+1);
    }
}
