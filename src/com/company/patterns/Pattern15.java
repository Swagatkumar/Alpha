package com.company.patterns;

/**
 * for n = 4
 * output :
 *    1
 *   212
 *  32123
 * 4321234
 */
public class Pattern15 {
    static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
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
