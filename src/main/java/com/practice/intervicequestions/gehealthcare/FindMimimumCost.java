package com.practice.intervicequestions.gehealthcare;

// TODO Incomplete
public class FindMimimumCost {


    public static void main(String args[]){

//aabcccabba -> 4

        System.out.println(        Math.IEEEremainder(12,5));

        int number = 300;
        // 300 -> 56 , 500->224
     //  System.out.println( SpecialNumbers(7,8,number));
    }

    static long SpecialNumbers(int IncreasingCost, int DecreasingCost, int number){
        int initialNumber = number;
        int increasing = 0;
        int decreasing =0  ;

        // TODO need to have proper condition
        while(true){
            number++;
            if(isSpecialNumber(number)){
                increasing = number - initialNumber;
                break;
            }
        }
        number = initialNumber;
        while(number >= 1){
            number--;
            if(isSpecialNumber(number)){
                decreasing = number - initialNumber;
                break;
            }
        }

        if( decreasing == 0 || increasing*IncreasingCost < decreasing * DecreasingCost){
            return increasing*IncreasingCost;
        }else{
            return decreasing*DecreasingCost;
        }
    }
    static boolean isSpecialNumber(int number){
        int[] oddPrimeArray = {3,5,7};

        for(int i=0; i<oddPrimeArray.length; i++){
            if( specialNumberCheckbyTwoDigit(number, oddPrimeArray[i], oddPrimeArray[(i+1) % oddPrimeArray.length])){
                return true;
            }
        }
        return false;
    }
//TODO find power
    static boolean specialNumberCheckbyTwoDigit(int number, int oddPrime1 , int oddPrime2){
        int remaining = number % oddPrime1 ;
        int remaining2 = number % oddPrime2;
        if(remaining ==0 || remaining2 ==0){
            return false;
        }
        return (remaining % oddPrime2 == 0 || remaining2 % oddPrime1 == 0);
    }

}
