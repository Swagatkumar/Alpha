package com.company.twodarray;

import com.company.array.Data;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];

            if(i!=matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(diagonalSum(Data.twoDArray));
    }
}
