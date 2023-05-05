package com.company.backtracking;

public class Sudoku {
    static void printBoard(int sudoku[][]){
        System.out.println("----------Sudoku board--------------");
        for(int row=0; row<sudoku.length; row++){
            for(int col=0; col<sudoku[0].length; col++){
                System.out.print(sudoku[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit){
        for(int i=0; i<9; i++){
            if(sudoku[row][i]==digit){
                return false;
            }
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        // grid
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i=startRow; i<startRow+3; i++){
            for(int j=startCol; j<startCol+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int[][] sudoku, int row, int col){
        //base case
        if(row==9){
            return true;
        }
        //recursion
        int nextRow = row, nextCol = col+1;
        if(nextCol==9){
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit = 1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
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

        System.out.println("Can this sudoku be solved? - "+sudokuSolver(sudoku, 0, 0));
        printBoard(sudoku);
    }
}
