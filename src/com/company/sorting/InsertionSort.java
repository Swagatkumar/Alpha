package com.company.sorting;

import com.company.array.Data;

public class InsertionSort {
    public static void sort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void reverseSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        sort(Data.numbers);
        Data.printArray(Data.numbers);
        reverseSort(Data.numbers);
        Data.printArray(Data.numbers);
    }
}
