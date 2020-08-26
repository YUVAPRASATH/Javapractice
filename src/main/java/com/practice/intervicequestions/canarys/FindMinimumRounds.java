package com.practice.intervicequestions.canarys;

public class FindMinimumRounds {
    public static void main (String args[]){
        // int N=8,K=0;
        int N=1800000,K=1000;
        // int N=10,K=10;
        System.out.println( N % 2);
        System.out.println("Total Round :"+solution(N,K));
    }
    public static int solution(int N, int K){
        if(K == 0){
            return N-1;
        }
        int totalRound = 0;
        while (N > 1){
            if(N % 2 != 0){
                N = N - 1;
            }else{
                N = N/2;
                K = K - 1;
                if(K==0){
                    break;
                }
            }
            totalRound  = totalRound + 1;
        }
        totalRound = totalRound + 1 + N;
        return totalRound;
    }
}
