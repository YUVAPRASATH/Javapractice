package com.practice.intervicequestions.blumeglobal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * Order numbers so that the sum of distance between two numbers is mimumum
 *  Input --> {5 , 4 , 8 , 2, 6}
 *  ordered-->{2, 4, 5, 6, 8}
 *  Distance > (2-4) + (4-5) + (5-6)+ (6-8) =6
 *  Print the distance
 * WORKING
 */
public class FindMinimumDistance {
    public  static void  main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(2);
        arr.add(1);
        System.out.println(minDiff(arr));
    }

    public static int minDiff(List<Integer> arr) {
        int total =0;
        Collections.sort(arr);
        for(int i = 0 ;i < arr.size()-1;i++){
            total = total + Math.abs(arr.get(i) - arr.get(i+1));
        }
        return total;
    }

}
