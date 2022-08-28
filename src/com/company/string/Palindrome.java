package com.company.string;

public class Palindrome {
    static boolean isPalindrome(String str){
        int start = 0, end = str.length()-1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("noon is "+(isPalindrome("noon")?"a palindrome":"not a palindrome"));
        System.out.println("moon is "+(isPalindrome("moon")?"a palindrome":"not a palindrome"));
    }
}
