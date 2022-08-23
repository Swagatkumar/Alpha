package com.company.array;

import java.util.Arrays;

public class ReverseArray {
    static int[] reverseArray(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Before: "+ Arrays.toString(Data.numbers));
        System.out.println("After: "+Arrays.toString(reverseArray(Data.numbers)));
    }
}
