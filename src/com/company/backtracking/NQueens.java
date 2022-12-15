package com.company.backtracking;

public class NQueens {
    static boolean isSafe(String[][] board, int row, int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=="Q"){
                return false;
            }
        }
        // left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        return true;
    }
    static void printBoard(String board[][]){
        System.out.println("----------Chess board--------------");
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
    static void nQueens(String[][] board, int row){
        if(row>=board.length){
            printBoard(board);
            return;
        }
        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = "Q";
                nQueens(board, row+1);
                board[row][col] = ".";
            }
        }
    }
    public static void main(String[] args) {
        int n=4;
        String[][] board = new String[n][n];
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                board[row][col] = ".";
            }
        }
        nQueens(board, 0);
    }
}
