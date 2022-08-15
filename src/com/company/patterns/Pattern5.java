package com.company.patterns;

/**
 * for row = 4 and col = 5
 * output :
 * *****
 * *   *
 * *   *
 * *****
 */
public class Pattern5 {
    static void printPattern(int row, int col) {
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        printPattern(4,5);
    }
}
