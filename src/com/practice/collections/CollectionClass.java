package com.practice.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionClass {
    public static void main(String args[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(4);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(6));
        System.out.println(arrayList);
        arrayList.add(0,5);
        System.out.println(arrayList);
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
       // set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
