package com.company.bitmanipulation;

public class PowerOfTwo {
    static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        String str = "Swadhin";
        String str1 = " Swadhin ";
        String str2 = new String("Swadhin");
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println("Before trim: "+str1+", After trim: "+str1.trim());

        System.out.println("Character at index 2 is: "+str.charAt(2));

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }

        System.out.println("32 is power of 2: "+isPowerOfTwo(32));
        System.out.println("17 is power of 2: "+isPowerOfTwo(17));
    }
}
