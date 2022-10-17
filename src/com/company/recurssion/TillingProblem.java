package com.company.recurssion;

public class TillingProblem {
    /**
     * dry run
     * for n=4
     * getWays(3)+getWays(2)
     * getWays(2)+getWays(1)+getWays(1)+getWays(0)
     * getWays(1)+getWays(0)+1+1+1
     * 1+1+3
     * 5
     */
    static int getWays(int n){ //for floor size (2xn)
        if(n==0||n==1){
            return 1;
        }
        return getWays(n-1)+getWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(getWays(4));
    }
}
