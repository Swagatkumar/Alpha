package com.company.math;

public class Factorial {
    static int factorial(int n){
        if(n==1)
            return n;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5: "+factorial(5));
    }
}
