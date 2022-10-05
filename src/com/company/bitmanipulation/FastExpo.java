package com.company.bitmanipulation;

/**
 * Time complexity: O(log n)
 * where 'n' is the power that to be calculated of 'a'
 */
public class FastExpo {
    static int fastExpo(int n, int pow){
        int ans = 1;
        while(pow>0) {
            if((pow & 1) != 0)
                ans *= n;
            n *= n;
            pow >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("3 power 2 is: "+fastExpo(3, 2));
    }
}
