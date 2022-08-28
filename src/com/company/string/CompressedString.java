package com.company.string;

public class CompressedString {
    public static String getCompressedString(String str){
        String compressed = "";
        char current = str.charAt(0);
        Integer count = 1;
        for(int i=1; i<str.length(); i++){
            if(current == str.charAt(i)){
                count++;
            }else{
                compressed += current+count.toString();
                current = str.charAt(i);
                count = 1;
            }
            if(i==str.length()-1){
                compressed += current+count.toString();
            }
        }

        return compressed;
    }
    public static void main(String[] args) {
        System.out.println("The compressed version of 'aabbbcccaddddeee' is: "+getCompressedString("aabbbcccaddddeee"));
    }
}
