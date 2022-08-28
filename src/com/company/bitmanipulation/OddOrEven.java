package com.company.bitmanipulation;

/**
 * To check 5 is odd
 *  5 = 00000101
 * &1 = 00000001
 *      00000001 = 1
 *
 * Similarly to check 6 is even
 *  6 = 00000110
 * &1 = 00000001
 *      00000000 = 0
 *
 * if result is '0' then 'even' or else if '1' then 'odd'.
 */
public class OddOrEven {
    static boolean isEven(int n){
        return (n&1)==0;
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
    public static void main(String[] args) {
        System.out.println("27 is even: "+isEven(27));
        System.out.println("27 is odd: "+isOdd(27));

        System.out.println("26 is odd: "+isOdd(26));
        System.out.println("26 is even: "+isEven(26));
    }
}
