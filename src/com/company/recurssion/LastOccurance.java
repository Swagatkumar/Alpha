package com.company.recurssion;

public class LastOccurance {
    static int getLastOccurance(int[] arr, int n, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = getLastOccurance(arr, n, i+1);
        if(isFound==-1&&arr[i]==n){
            return i;
        }
        return isFound;
    }
     public static void main(String[] args) {
        System.out.println(getLastOccurance(new int[]{23,12,54,36,36,25,93}, 36, 0));
     }
}
