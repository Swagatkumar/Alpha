package com.company.recurssion;

public class Fibonacci {
    static int getFibonacci(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("5th Fibonacci number is: "+getFibonacci(-3));
    }
}
