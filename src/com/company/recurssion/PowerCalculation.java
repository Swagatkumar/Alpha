package com.company.recurssion;

public class PowerCalculation {
    static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);
    }

    static int optimizedPow(int x, int n){
        if(n==0){
            return 0;
        }
        if((n&1)==1){
            return x*pow(x, n/2)*pow(x, n/2);
        }
        return pow(x, n/2)*pow(x,n/2);
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
        System.out.println(pow(2, 5));
    }
}
