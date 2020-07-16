package com.javapractice.thesis.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoining {
    public static void main(String args[]){
        List<Character> ch = Arrays.asList('G', 'e', 'e', 'k', 's',
                'f', 'o', 'r',
                'G', 'e', 'e', 'k', 's');

        // Convert the character list into String
        // using Collectors.joining() method
        // with, as the delimiter
        String chString = ch.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("","'","'"));

        // Print the concatenated String
        System.out.println(chString);

        String chString2 = ch.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(chString2);

        String chString3= ch.stream()
                .map(String::valueOf)
                .map(arr -> arr.toUpperCase())
                .collect(Collectors.joining());

        // Print the concatenated String
        System.out.println("chString3 : "+chString3);
    }
}
