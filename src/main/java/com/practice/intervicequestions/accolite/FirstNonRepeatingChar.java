package com.practice.intervicequestions.accolite;

import java.util.HashMap;
import java.util.TreeSet;

public class FirstNonRepeatingChar {
    public static void main(String args[]){
        // find first non-repeating character in a stri

        String str = "allwwayys";
        char[] arr = str.toCharArray();

        TreeSet<Character> treeSet = new TreeSet<>();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for (int i = 0 ; i< arr.length;i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else{
                int number = hashMap.get(arr[i]);
                hashMap.put(arr[i], number+1);
            }
        }
        System.out.println(hashMap);
        for (int i = 0 ; i< arr.length;i++){
            if(hashMap.get(arr[i]) == 1 ){
                System.out.println("First non-repeating char :" + arr[i]);
                break;
            }
        }
    }
}
