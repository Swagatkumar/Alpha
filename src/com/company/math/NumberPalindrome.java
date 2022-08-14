package com.company.math;

public class NumberPalindrome {
    static boolean isPalindrome(int n){
        int reversed = n%10;
        int temp = n/10;
        while(temp!=0){
            reversed = (reversed*10)+(temp%10);
            temp /= 10;
        }
        return n==reversed;
    }
    public static void main(String[] args) {
        System.out.println("Is 121 palindrome: "+isPalindrome(121));
        System.out.println("Is 321 palindrome: "+isPalindrome(321));
    }
}
