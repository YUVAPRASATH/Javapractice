package com.practice.variety;

public class PrimeNumbers {
    public static void main(String args[]){
        System.out.println();
        primeNumber(10);
    }

    public static void primeNumber(int n){
        boolean isPrime;
        for(int i = 2 ;i < n ; i++){
            isPrime = true;
            for(int j= 2 ; j < i ; j++){
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }

    public static void nPrimeNumbers(int n){
            int primeCount = 0;
            System.out.println();
    }


    public static void recursivePrime(int count){
        int ct=0;
        int n=0;
        int i=1;
        int j=1;

        while(n<count){
            j=1;
            ct=0;

            while (j<=i){
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.printf("%d ",i);
                n++;
            }
            i++;

        }

    }
}
