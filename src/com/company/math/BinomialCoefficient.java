package com.company.math;

public class BinomialCoefficient {
    static int nCr(int n, int r){
        int nFact = Factorial.factorial(n);
        int rFact = Factorial.factorial(r);
        int nMrFact = Factorial.factorial(n-r);

        return nFact/(rFact*nMrFact);
    }
    public static void main(String[] args) {
        System.out.println("Binomial coefficiant of n=5, r=2: "+nCr(5,2));
    }
}
