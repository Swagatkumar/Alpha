package com.company.recurssion;

public class FriendsPairing {
    static int findPairWays(int n){
        if(n==1||n==2){
            return n;
        }
        return findPairWays(n-1)+((n-1)*findPairWays(n-2));
    }
    public static void main(String[] args) {
        System.out.println(findPairWays(3));
    }
}
