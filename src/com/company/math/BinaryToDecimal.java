package com.company.math;

public class BinaryToDecimal {
    static int binaryToDecimal(int binary){
        int decimal = 0;
        int pow = 0;
        while(binary!=0){
            decimal += (binary%10)*(int)Math.pow(2,pow++);
            binary /= 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println("Decimal value of the Binary number 1100 is: "+binaryToDecimal(1100));
    }
}
