package com.javapractice.system;

import java.io.Console;
import java.util.Map;
import java.util.Properties;

public class SystemDemo {
    public static void main(String args[]){
      /*  Console c = System.console();
        c.printf("Print from console");*/
       // System.exit(0);
        Map<String, String> systemEnv = System.getenv();
        systemEnv.entrySet().stream().forEach(entry ->{
            System.out.println(entry.getKey() + " :" + entry.getValue());
        });
        System.out.println("Test :" + System.getenv("IDEA_INITIAL_DIRECTORY"));

        Properties systemProperties =System.getProperties();
        //systemProperties.entrySet().stream();
        System.out.println(systemProperties);

    }
}
