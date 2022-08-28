package com.company.bitmanipulation;

public class ClearRange {
    static int clearRange(int n, int from, int to){
        int a = (~0)<<(to+1);
        int b = (~0)>>(from+to);
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println("After clearing bits from range 2 to 7 of 10 is: "+clearRange(10, 2, 7));
        System.out.println(-1<<2);
    }
}
