package com.company.array;

public class TrappedRainWater {
    static int trapperRainWater(int[] heights){
        if(heights.length<3) return 0;

        int[] maxLeft = new int[heights.length];
        maxLeft[0] = heights[0];
        for(int i=1; i<maxLeft.length; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], heights[i]);
        }

        int[] maxRight = new int[heights.length];
        maxRight[maxRight.length-1] = heights[heights.length-1];
        for(int i=maxRight.length-2; i>=0; i--){
            maxRight[i] = Math.max(maxRight[i+1], heights[i]);
        }

        int result = 0;
        for(int i=1; i<heights.length-1; i++){
            result += Math.min(maxLeft[i], maxRight[i])-heights[i];
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Total water volume stored: "+trapperRainWater(Data.numbers));
    }
}
