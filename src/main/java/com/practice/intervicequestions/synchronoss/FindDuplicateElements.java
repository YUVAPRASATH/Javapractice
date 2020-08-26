package com.practice.intervicequestions.synchronoss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindDuplicateElements {
    public static  void main(String args[]) {
        int[] arr = new int[]{1, 4, 1, 5, 1, 1, 2, 2, 2, 3, 4};

        // Using HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(arr[i])) {
                resultSet.add(arr[i]);
            } else {
                hashSet.add(arr[i]);
            }
        }
        System.out.println(resultSet);

        // Using HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : arr) {
            if (hashMap.containsKey(a)) {
                int temp = hashMap.get(a);
                hashMap.put(a, temp + 1);
            } else {
                hashMap.put(a, 1);
            }
        }
        System.out.println("Duplicate Elements");
        hashMap.forEach((integer, integer2) -> {
            if (integer2 > 1)
                System.out.print(integer + " ");
        });
    }
}