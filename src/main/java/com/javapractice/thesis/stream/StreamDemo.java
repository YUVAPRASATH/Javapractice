package com.javapractice.thesis.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String args[]){
        // Data
        //List<Integer> arrayList = Arrays.asList(1,5,7,9,null);
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(null);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList);
        System.out.println(arrayList.stream().anyMatch(integer -> {
            if(integer==null)
                 return true;
            return false;
        } ) );
       // List distinctList = Arrays.asList(arrayList.stream().distinct().toArray());
        List distinctList = arrayList.stream().distinct().collect(Collectors.toList());
        System.out.println( "Distinct List :" +distinctList);
      // arrayList.stream().
       // TODO comparator, predicate, supplier, conusmer
        arrayList.add(1);
        System.out.println(arrayList);

        // TODO parallel stream
    }
}
