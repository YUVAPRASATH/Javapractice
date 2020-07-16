package com.javapractice.thesis.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    public static void main(String args[]){


        Stream<String[]>
                str = Stream
                .of(new String[][] { { "GFG", "GeeksForGeeks" },
                        { "g", "geeks" },
                        { "G", "Geeks" } });

        // Convert the String to Map
        // using toMap() method
        Map<String, String>
                map = str.collect(
                Collectors.toMap(p -> p[0], p -> p[1]));

        System.out.println("Map :" + map);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
       /* arrayList.add(1);
        arrayList.add(2);*/

        Map<Integer,String>  testMap = new HashMap<>();
        testMap = arrayList.stream().collect(Collectors.toMap( x -> {
            System.out.println("X value"+ x.getClass());
            return x;
        }, x->String.valueOf(x)));

        System.out.println("Map :" + testMap);

    }
}
