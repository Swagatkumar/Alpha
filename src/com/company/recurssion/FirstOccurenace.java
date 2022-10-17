package com.company.recurssion;

public class FirstOccurenace {
    static int getFirstOccurance(int[] arr, int n, int i){
        if(arr[i]==n){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return getFirstOccurance(arr, n, i+1);
    }
    public static void main(String[] args) {
        System.out.println(getFirstOccurance(new int[]{23,12,54,36,36,25,93}, 36, 0));
    }
}
