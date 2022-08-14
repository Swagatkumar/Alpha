package com.company.patterns;

/**
 * for n = 4
 * output :
 * A
 * BC
 * DEF
 * GHIJ
 */
public class Pattern4 {
    static void printPattern(int n) {
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
