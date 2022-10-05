package com.company.bitmanipulation;

/**
 * Time complexity = O(log n)
 * The minimum number of bits a number can be represented in is 'log n' bits.
 * Lets n = 16
 * So, minimum log 16 bits required to represent 16
 * 16 = 10000
 * number of bits  = 5 = log 16 base 2 + 1
 */
public class NumberOfSetBits {
    static int numberOfSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0)
                count++;
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Number of set bits in 16 is: "+numberOfSetBits(16));
        System.out.println("Number of set bits in 15 is: "+numberOfSetBits(15));
    }
}
