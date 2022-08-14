package com.company.patterns;

/**
 * for n = 4
 * output :
 * *
 * **
 * ***
 * ****
 */
public class Pattern1 {
    static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
