package com.company.array;

public class BinarySearch {
    static int binarySearch(int[] arr, int n){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==n) return mid;
            if(n<arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int index = binarySearch(Data.sortedNumbers, 23);
        System.out.println(index==-1?"not found":"found at index: "+index);
    }
}
