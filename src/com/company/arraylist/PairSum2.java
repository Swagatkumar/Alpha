package com.company.arraylist;

import java.util.ArrayList;

//for sorted and rotated array find if there is a possible pair sum
public class PairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int n = list.size();
        int pivot = n-1;
        for(int i=0; i<n-1; i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }

        int l = (pivot+1)%n;
        int r = pivot;

        while(l!=r){
            int sum = list.get(l)+list.get(r);
            if(sum==target){
                return true;
            }
            if(sum<target){
                l = (l+1)%n;
            }else{
                r = (n+r-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);

        System.out.println("Sum exists: "+pairSum(list, 50));
    }
}
