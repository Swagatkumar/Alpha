package com.company.array;

public class SubArray {
    static void printSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println();
                maxSum = Math.max(sum, maxSum);
                minSum = Math.min(sum, minSum);
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays are: "+arr.length*(arr.length+1)/2);
        System.out.println("Approach 1: Max sub array sum: "+maxSum);
        System.out.println("Min sub array sum: "+minSum);
    }
    static int maxSubArraySum1(int[] arr){
        int result = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        for(int start=0; start<arr.length; start++){
            for(int end=start; end<arr.length; end++){
                int sum = start==0?prefix[end]:prefix[end]-prefix[start-1];
                result = Math.max(sum, result);
            }
        }
        return result;
    }
    static int maxSubArraySum2(int[] arr){
        int result = Integer.MIN_VALUE;
        int sum = arr[0];
        for(int i=1; i<arr.length; i++){
            sum = Math.max(arr[i]+sum, arr[i]);
            result = Math.max(result, sum);
        }
        return result;
    }
    public static void main(String[] args) {
        printSubArray(Data.integers);
        System.out.println("Approach 2: Max sub array sum: "+maxSubArraySum1(Data.integers));
        System.out.println("Approach 3: Max sub array sum: "+maxSubArraySum2(Data.integers));
        System.out.println("Approach 3: Max sub array sum with all negatives: "+maxSubArraySum2(Data.negativeInts));
    }
}
