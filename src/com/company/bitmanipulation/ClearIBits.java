package com.company.bitmanipulation;

/**
 * Example-
 * 15 = 00001111
 * clear 2 bits - 00001100 = 12
 *
 * Approach: n & ((~0)<<i)
 * ~0 = 11111111
 * e.g. i = 2
 * n = 15 =   00001111
 * &(~0)<<i = 11111100
 *            00001100 = 12
 */
public class ClearIBits {
    static int clearIBits(int n, int i){
        int bitMask = -1<<i; //(~0)<<i
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println("After clearing bits till 2nd position of 15 value is: "+clearIBits(15, 2));
    }
}
