package com.company.divideandconquer;

import java.util.Arrays;

public class MergeSort {
    static void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }
    private static void mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    private static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        for(int i=0, j=si, k=mid+1; i<temp.length; i++){
            if(k==ei+1){
                temp[i]=arr[j];
                j++;
                continue;
            }
            if(j==mid+1){
                temp[i]=arr[k];
                k++;
                continue;
            }
            if(arr[j]<arr[k]){
                temp[i] = arr[j];
                j++;
            }else{
                temp[i]=arr[k];
                k++;
            }
        }
        for(int i=0, j=si; i<temp.length; i++, j++){
            arr[j]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,423,22,4,74,26,83,45,-2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
