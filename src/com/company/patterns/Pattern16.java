package com.company.patterns;

public class Pattern16 {
    static void printBoard(String[][] board){
        int rank = 8;
        char file = 'a';
        for(int i=0; i<8; i++){
            for(int a=0; a<5&&!(i<7&&a==4); a++){
                for(int j=0; j<8; j++){
                    for(int b=0; b<5&&!(j<7&&b==4); b++){
                        if(j==0&&b==0){
                            if(a==2){
                                System.out.print(rank--+" ");
                            }else{
                                System.out.print("  ");
                            }
                        }
                        if(a==0||a==4||b==0||b==4){
                            System.out.print("# ");
                        }
                        else if(a==2&&b==2&&board[i][j]!=null){
                            System.out.print(board[i][j]+" ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        }
        System.out.print("  ");
        int count = 2;
        for(int i=0; i<32; i++){
            if(i==count){
                System.out.print((file++)+" ");
                count+=4;
            }else{
                System.out.print("  ");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        String[][] board = new String[8][8];
        for(int i=0; i<8; i++){
            board[1][i] = "p";
        }
        for(int i=0; i<8; i++){
            board[6][i] = "P";
        }
        board[0][0] = "r";
        board[0][1] = "n";
        board[0][2] = "b";
        board[0][3] = "k";
        board[0][4] = "q";
        board[0][5] = "b";
        board[0][6] = "n";
        board[0][7] = "r";
        board[7][0] = "R";
        board[7][1] = "N";
        board[7][2] = "B";
        board[7][3] = "K";
        board[7][4] = "Q";
        board[7][5] = "B";
        board[7][6] = "N";
        board[7][7] = "R";
        printBoard(board);
    }
}
