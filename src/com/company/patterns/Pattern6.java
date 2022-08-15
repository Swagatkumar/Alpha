package com.company.patterns;

/**
 * for n = 4
 * output :
 *    *
 *   **
 *  ***
 * ****
 */
public class Pattern6 {
    static void printPattern(int n) {
        for(int i=0; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n-j<i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPattern(n);
    }
}
