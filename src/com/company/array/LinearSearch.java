package com.company.array;

public class LinearSearch {
    static int linearSearch(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int index = linearSearch(Data.numbers, 72);
        System.out.println(index==-1?"not found":"found at index: "+index);
    }
}
