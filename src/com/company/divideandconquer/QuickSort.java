package com.company.divideandconquer;

import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex-1);
        quickSort(arr, pivotIndex+1, ei);
    }
    private static int partition(int[] arr, int si, int ei) {
        int idx = si-1;
        int pivot = arr[ei];
        for(int i=si; i<=ei; i++){
            if(arr[i]<pivot||i==ei){
                idx++;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        return idx;
    }
    public static void sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,423,22,4,74,26,83,45,-2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
