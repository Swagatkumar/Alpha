package com.company.bitmanipulation;

/**
 * Example-
 * n = 000110011001
 * range given, from = 2, to = 7
 * After clearing the range:
 * n = 000100000001
 * 
 * Approach: n & bitMask
 *  n       = 000110011001
 * &bitMask = 111100000011
 *          = 000100000001
 * 
 * Calculating bitMask = a | b
 * where a = 111100000000 = (~0)<<(to+1)
 *      |b = 000000000011 = (1<<from)-1 = 000000000100 - 1
 *         = 111100000011
 */
public class ClearRange {
    static int clearRange(int n, int from, int to){
        int a = (~0)<<(to+1);
        int b = (1<<from)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println("After clearing bits from range 2 to 7 of 10 is: "+clearRange(10, 2, 7));
    }
}
