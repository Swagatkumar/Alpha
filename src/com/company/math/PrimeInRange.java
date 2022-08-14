package com.company.math;

public class PrimeInRange {
    static void primeRange(int n){
        for(int i=2; i<=n; i++){
            if(PrimeNumber.isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        primeRange(50);
    }
}
