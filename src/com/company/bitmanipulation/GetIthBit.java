package com.company.bitmanipulation;

public class GetIthBit {
    static int getIthBit(int n, int pos){
        int bitMask = 1<<pos;
        if((n & bitMask) == 0)
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("The bit at 1st position of 5 is: "+getIthBit(5,1));
        System.out.println("The bit at 1st position of 6 is: "+getIthBit(6,1));
    }
}
