package com.company.recurssion;

public class RemoveDuplicate {
    static void removeDuplicate(String str, int idx, String newStr, boolean[] map){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char ch = str.charAt(idx);
        if(map[ch-'a']){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[ch-'a']=true;
            removeDuplicate(str, idx+1, newStr+ch, map);
        }
    }
    public static void main(String[] args) {
        removeDuplicate("appnnacollege", 0, "", new boolean[26]);
    }
}
