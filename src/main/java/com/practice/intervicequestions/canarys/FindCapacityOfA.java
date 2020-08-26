package com.practice.intervicequestions.canarys;

/**
 * write a function solution that, give a string str consisting of N characters, return the
 * maximum number of letter 'a' that can be inserted into S (including front and end) so
 * that the resulting string doesn't contain threee consecutive letters 'a'.
 * if 3 consecutive a , return -1
 *
 * str = "aabab" --> 3
 * str = "dog"--> 8
 * str = "aa" --> 0
 * str = "baaa"--> -1
 *
 */
public class FindCapacityOfA {
    public static void main (String args[]){
        String str="aabab";
        System.out.println(solution(str));
    }
    public static int solution(String str){
        int pointer = 0;
        char checkChar = 'a';
        int result = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == checkChar){
                pointer = pointer+1;
            }else{
                result=result + (2-pointer);
                pointer = 0;
            }
            if(pointer == 3){
                return -1;
            }
        }
        result = result + (2 - pointer);
        return result;
    }
}
