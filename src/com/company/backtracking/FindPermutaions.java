package com.company.backtracking;

public class FindPermutaions {
    static void findPermutaions(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            findPermutaions(str.substring(0, i)+str.substring(i+1), ans+curr);
        }
    }
    public static void main(String[] args) {
        findPermutaions("abc", "");
    }
}
