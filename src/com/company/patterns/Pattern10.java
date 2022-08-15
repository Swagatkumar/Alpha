package com.company.patterns;

/**
 * for n = 4
 * output :
 * *      *
 * **    **
 * ***  ***
 * ********
 * ********
 * ***  ***
 * **    **
 * *      *
 */
public class Pattern10 {
    static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++) {
                System.out.print(j <= i?"*":" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(j>=n+1-i ? "*" : " ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j<=n+1-i ? "*" : " ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(j>=i ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
