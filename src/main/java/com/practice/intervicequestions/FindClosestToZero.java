package com.practice.intervicequestions;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class FindClosestToZero {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        List<Integer> arrayList = Arrays.asList(5,8,-3,0,-3);
        int N = 5;
        int closest = 0;
        for (int i = 0; i < N; i++) {
            int t = arrayList.get(i);
          if(i==0){
                closest=t;
                continue;
            }
            if((Math.abs(t)-1) < (Math.abs(closest)-1)){
                closest=t;
                continue;
            }
            if((Math.abs(t)-1) == (Math.abs(closest)-1)){
                if(t > closest){
                    closest = t;
                }
            }
        }
        System.out.println(closest);
    }
}