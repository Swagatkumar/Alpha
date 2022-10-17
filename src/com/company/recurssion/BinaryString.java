package com.company.recurssion;

/**
 * Print all the combination of 'n' binary numbers without consecutive 1
 */
public class BinaryString {
    static void printBinaryStrings(int n, String binaryString){
        if(n==0){
            System.out.println(binaryString);
            return;
        }
        String lastChar = binaryString.equals("")?"0":binaryString.charAt(binaryString.length()-1)+"";
        printBinaryStrings(n-1, binaryString+"0");
        if(lastChar.equals("0")){
            printBinaryStrings(n-1, binaryString+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryStrings(3, "");
    }
}
