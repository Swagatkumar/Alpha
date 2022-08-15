package com.company.patterns;

/**
 * for n = 4
 * output :
 * 1
 * 01
 * 101
 * 0101
 */
public class Pattern9 {
    static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            int bit = i%2==0 ? 0 : 1;
            for(int j=1; j<=i; j++){
                System.out.print(bit);
                bit = bit==1 ? 0: 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
