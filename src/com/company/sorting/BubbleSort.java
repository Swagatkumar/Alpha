package com.company.sorting;

import com.company.array.Data;

public class BubbleSort {
    public static void sort(int[] arr){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int i=0; i<arr.length-1-turn; i++){
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }

    public static void reverseSort(int[] arr){
        for(int turn=0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int i=0; i<arr.length-1-turn; i++){
                if(arr[i] < arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }

    public static void main(String[] args) {
        sort(Data.numbers);
        Data.printArray(Data.numbers);
        reverseSort(Data.numbers);
        Data.printArray(Data.numbers);
    }
}
