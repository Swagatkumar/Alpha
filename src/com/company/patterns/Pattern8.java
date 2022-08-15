package com.company.patterns;

/**
 * for n = 4
 * output :
 * 1
 * 23
 * 456
 * 78910
 */
public class Pattern8 {
    static void printPattern(int n) {
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
