package com.company.arraylist;

import java.util.ArrayList;

public class PairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target){ //list should be sorted
        int l = 0;
        int r = list.size()-1;
        while(l<r){
            int sum = list.get(l)+list.get(r);
            if(sum==target){
                return true;
            }
            if(sum>target){
                r--;
            }else{
                l++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Sum exists: "+pairSum(list, 5));
    }
}
