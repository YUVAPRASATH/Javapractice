package com.practice.intervicequestions;

/*
John has a fascination with numbers, but he feels that the number 3 is unlucky.
Given a number N as input finds the largest number less than or equal to N which do not contain the unlucky digit 3.
Input
An integer N which is less than 1,000,000
Output
An integer is less than or equal to N, which does not contain the unlucky digit 3.
For example:
If the input number is 1248 then this number doesn’t contain digit 3, and hence, the output would be the same number i.e. 1248.
If the input number is 1234 then this number contains digit 3 and we will decrement this input number by 1 in each iteration till we reach the number 1229 which follows the desired condition.
 */
public class NoThree {
    public static void main(String args[]){
        int number = 230;
        while(number > 0){
            int i=number;
            String numberString = Integer.toString(i);
            if(numberString.contains("3")) {
                number--;
                continue;
            }
            System.out.println(i);
            break;
        }
    }
}
