package com.company.math;

public class SumOfDigits {
    static int sumOfDigits(int n){
        int sum = 0;
        while(n!=0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Sum of digits of 123 is: "+sumOfDigits(123));
    }
}
