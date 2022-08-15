package com.company.patterns;

/**
 * for n = 4
 * output :
 * 1234
 * 123
 * 12
 * 1
 */
public class Pattern7 {
    static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
