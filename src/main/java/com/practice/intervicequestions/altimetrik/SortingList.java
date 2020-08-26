package com.practice.intervicequestions.altimetrik;

import java.util.ArrayList;

public class SortingList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(5);
        arr.add(4);
        System.out.println("Before Sorting :" + arr);
        int count = arr.size();
        for (int j = 0; j < count; j++) {
            for (int i = 1; i < count; i++) {
                if (arr.get(i) < arr.get(i - 1)) {
                    int temp = arr.get(i - 1);
                    arr.remove(i - 1);
                    arr.add(i, temp);
                }
            }
        }
        System.out.println("Sorted List :" + arr);
    }
}
