package com.company.twodarray;

import com.company.array.Data;

public class SpiralMatrix {
    public static void printSpiralMatrix(int[][] matrix){
        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            // top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            // right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }

            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        printSpiralMatrix(Data.twoDArray);
    }
}
