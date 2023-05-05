package com.company.arraylist;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> heights){
        int maxArea = 0;
        int l = 0;
        int r = heights.size()-1;

        while(l<r){
            int ht = Math.min(heights.get(l), heights.get(r));
            int width = Math.abs(l-r);
            int area = ht*width;
            if(maxArea<area){
                maxArea = area;
            }

            if(l<=r){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ArrayList<Integer> heights = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println("Max area found is: "+storeWater(heights));
    }
}
