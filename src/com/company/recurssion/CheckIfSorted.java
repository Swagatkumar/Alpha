package com.company.recurssion;

public class CheckIfSorted {
    static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{2,3,4,12,6,7,8}, 0));
    }
}
