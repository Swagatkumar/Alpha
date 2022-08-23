package com.company.array;

public class LargestValue {
    static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int ele : arr){
            if(largest<ele) largest = ele;
        }
        return largest;
    }
    public static void main(String[] args) {
        System.out.println("The largest value in the array is: "+findLargest(Data.numbers));
    }
}
