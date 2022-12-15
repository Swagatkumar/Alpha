package com.company.backtracking;

public class GridWays {
    static int gridWays(int i, int j, int m, int n){
        if(i==m-1&&j==n-1){
            return 1;
        }else if(i>=m || j>=n){
            return 0;
        }

        int w1 = gridWays(i+1, j, m, n);
        int w2 = gridWays(i, j+1, m, n);

        return w1+w2;
    }
    public static void main(String[] args) {
        int m=3, n=2;
        int totalWays = gridWays(0, 0, m, n);
        System.out.println(totalWays);
    }
}
