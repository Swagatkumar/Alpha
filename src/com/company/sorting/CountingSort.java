package com.company.sorting;

import com.company.array.Data;

public class CountingSort {
    public static void sort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] counts = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            counts[arr[i]]++;
        }

        for(int i=0, j=0; i<counts.length; i++){
            while(counts[i]>0){
                arr[j++] = i;
                counts[i]--;
            }
        }
    }

    public static void reverseSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] counts = new int[largest+1];

        for(int i=0; i<arr.length; i++){
            counts[arr[i]]++;
        }

        for(int i=counts.length-1, j=0; i>=0; i--){
            while(counts[i]>0){
                arr[j++] = i;
                counts[i]--;
            }
        }
    }

    public static void main(String[] args) {
        sort(Data.numbers);
        Data.printArray(Data.numbers);
        reverseSort(Data.numbers);
        Data.printArray(Data.numbers);
    }
}
