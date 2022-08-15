package com.company.patterns;

/**
 * for n = 4
 * output :,
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 */
public class Pattern14 {
    static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
