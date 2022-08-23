package com.company.sorting;

import com.company.array.Data;

public class SelectionSort {
    public static void sort(int[] arr) {
       for(int i=0; i<arr.length-1; i++){
           int minPos = i;
           for(int j=i+1; j<arr.length; j++){
               if(arr[minPos]>arr[j]) minPos = j;
           }
           if(minPos != i){
               int temp = arr[i];
               arr[i] = arr[minPos];
               arr[minPos] = temp;
           }
       }
    }

    public static void reverseSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int maxPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[maxPos]<arr[j]) maxPos = j;
            }
            if(maxPos != i){
                int temp = arr[i];
                arr[i] = arr[maxPos];
                arr[maxPos] = temp;
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
