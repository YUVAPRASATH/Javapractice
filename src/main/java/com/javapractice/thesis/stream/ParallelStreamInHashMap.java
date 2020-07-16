package com.javapractice.thesis.stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ParallelStreamInHashMap {

    private static ConcurrentHashMap<Integer, HashSet<String>> testHashMap =  new ConcurrentHashMap<>();

    public static void main(String args[]) {

        for(int j =0 ;j<100;j++){
            testHashMap = new ConcurrentHashMap<>();
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        int charArraySize = charArray.length;
        Random random = new Random();
        int totalCount = 10;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < totalCount; i++) {
            stringList.add("" + charArray[random.nextInt(charArraySize)] +
                    charArray[random.nextInt(charArraySize)] +
                    charArray[random.nextInt(charArraySize)] + i);
        }

        System.out.println("List Size :" + stringList.size());

        stringList.stream().parallel().forEach(x -> addElement_Replacement(x));

        int hashSetCount = 0;
        for (HashSet<String> set : testHashMap.values()) {
            hashSetCount = hashSetCount + set.size();
        }
        if(hashSetCount !=totalCount){
            System.out.println("Error");
        }
        System.out.println("Total Count in  HashSet :" + hashSetCount);
    }

    }

    public static void  addElement(String str)  {

        HashSet<String> hashSet = testHashMap.get((int)str.charAt(0));
        // Waste Code
      /*  int[] waitTime = {5000,1000,15000,11000,12000,13000,14000,16000};
        Random random = new Random();
        int randomnumber = waitTime[random.nextInt(8)];
        try {
            Thread.sleep(randomnumber);
        }catch (Exception e){
            System.out.println("Exception Occured");
        }
        System.out.println("Random Time :" + randomnumber);
        System.out.println("wait over here");*/

        // End of waste code

        if(hashSet == null){
            hashSet = new HashSet<String>();
        }
        hashSet.add(str);
        testHashMap.put((int)str.charAt(0), hashSet);
    }

    public  static  void addElement_Replacement(String str){
        HashSet<String> hashSet = testHashMap.get((int)str.charAt(0));
        if(hashSet == null){
            hashSet = new HashSet<String>();
            hashSet.add(str);
        }

/*        testHashMap.putIfAbsent((int)str.charAt(0),hashSet);
        testHashMap.computeIfPresent((int)str.charAt(0), (k,val)->{
            val.add(str);
            return val;
        });*/

      testHashMap.computeIfAbsent((int) str.charAt(0), val -> new HashSet<>()).add(str);
    }

}
