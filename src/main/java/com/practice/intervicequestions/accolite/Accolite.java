package com.practice.intervicequestions.accolite;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class Accolite {
    public static void main(String args[]) {

        //Executor;

        Map<String, String> newMap = new HashMap<>();
        newMap.put("a", "b");
        newMap.forEach((s, s2) -> System.out.println("key :" + s + " Value :" + s2));


        //.collect(Collectors.toList());
        //  .forEach(x -> Character.toUpperCase(x));


    /*
   */

     /*   Thread t =new Thread(){Accolite::test}
        Thread t1 = new Thread(() -> {

        });

// Question :
        Map<String, String> newMap = new HashMap<>();
           for(Map.Entry map : newMap.entrySet()){ }
           newMap.forEach((s, s2) -> System.out.println("key :" + s + " Value :" + s2));


// Question :

        Character[] charList=new Character[]{'A','B','c','D','E','F','G','h','I','J','K','L','M','N','O','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','A','B','C','D','E','F','G','H','I','J','K','L','M','n','O','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','A','b','C','D','E','F','G','H','I','J','K','L','m','N','O','A','B','C','D','E','F','G','H','I','J','K','L','m','N','O','A','B','C','D','E','F','g','H','I','J','K','L','M','N','O'};
        List<Character> charArrayList = Arrays.asList(charList);
        List<Character> smallToCapitalList =  charArrayList.stream().filter( x -> (x >= 97 && x <= 122))
                .map(Character:: toUpperCase).collect(Collectors.toList());
        System.out.println(smallToCapitalList);


// Question :
    class B implements A {
    }

    a. A a = new A();
    b. A a = new B();
    c. B b = new A();
    d. B b = new A(){};
    e. A a = new A(){};

    Valid -> b,d

Runnable r=new Runnable(){()->{sysout("Hello")}}


// Question :
        String s = null;
        if(s!=null ||s. length()==0)
            System.out.println("All Good");
        else{
            System.out.println("Something Bad");
        }

// Question :

    public static void test() {
        System.out.println(("Hello"));
    }

    public static String test(String s) {
        return "Test with String";
    }

    public static String test(Object s) {
        return "Test with Object";
    }

    public static String test(Integer s) {
        return "Test with Integer";
    }

     System.out.println(test(null));
     // throws ambigious  error
     // If we delete Integer , then it will use String (Child has high precedence over Parent)

// Question :

     accesser modifier precedence

// Question :
    Double lock singleton pattern

     public static DclSingleton getInstance() {
        if (instance == null) {
            synchronized (DclSingleton .class) {
                if (instance == null) {
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

  */

    }

}