package com.company.backtracking;

public class Sudoku {
    static void printBoard(int sudoku[][]){
        System.out.println("----------Chess board--------------");
        for(int row=0; row<sudoku.length; row++){
            for(int col=0; col<sudoku[0].length; col++){
                System.out.print(sudoku[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static boolean sudokuSolver(int[][] sudoku, int i, int j){
        if(i>=8&&j>=8){
            printBoard(sudoku);
            return true;
        }
        if(i>8||j>8){
            return false;
        }
        if(sudoku[i][j]==0){
            for(int k=1; k<=9; k++){
                sudoku[i][j] = k;
                if(j<9){
                    sudokuSolver(sudoku, i, j+1);
                }else{
                    sudokuSolver(sudoku, i+1, 0);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] sudoku = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0, 5, 3, 0, 8},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        sudokuSolver(sudoku, 0, 0);
        printBoard(sudoku);
    }
}
