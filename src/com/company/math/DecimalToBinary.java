package com.company.math;

public class DecimalToBinary {
    static int decimalToBinary(int decimal){
        int binary = 0;
        int pow = 0;
        while(decimal!=0){
            binary += (decimal%2)*(int)Math.pow(10,pow++);
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println("Binary number of the decimal number 17 is: "+decimalToBinary(17));
    }
}
