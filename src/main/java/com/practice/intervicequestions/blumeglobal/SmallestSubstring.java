package com.practice.intervicequestions.blumeglobal;


import java.util.HashSet;

/**
 *  String inputString;
 *  Find smallest substring which contains all the charaters present in the inputString
 *
 *  WORKING
 *
 */
public class SmallestSubstring {

    public static void main(String args[]){
        HashSet<Character> coinSet = new HashSet<Character>();
        System.out.println(fewestCoins("asdfkjeghfalawefhaef"));
        System.out.println("Call Count :" + callCount);
    }

    public static int fewestCoins(String coins) {

        char[] coinArray = coins.toCharArray();
        HashSet<Character> coinSet = new HashSet<Character>();
        for(Character coin : coinArray){
            coinSet.add(coin);
        }

        int count = coins.length();
        int minimumSize = coinSet.size();
        for(int x =0 ;x <coins.length(); x ++) {
            int i=x;
            while (i < coins.length()) {
                if (i + minimumSize > coins.length())
                    break;
                String subString = coins.substring(x, i + minimumSize);
                if(subString.length() >= count)
                    break;
                System.out.println(subString);
                if (isAvailable((HashSet<Character>) coinSet.clone(), subString)) {
                    if (subString.length() < count)
                        count = subString.length();
                }
                i++;
            }
        }
        int i;
        i = coins.length();
        while(i>0){
            if(i-minimumSize <= -1){
                break;
            }
            String subString = coins.substring(i-minimumSize,coins.length());
            System.out.println(subString);
            if(isAvailable((HashSet<Character>) coinSet.clone(),subString)){
                if(subString.length() < count)
                    count = subString.length();
            }
            i--;
        }
        //  System.out.println(coinSet.toString());

      /*  for(int i=0; i<coins.length();i++){
            if( (i+coinSet.size()) < coins.length()){
                String subString = coins.substring(i,i+coinSet.size());
                if(isAvailable((HashSet<Character>) coinSet.clone(),subString)){
                    if(subString.length() < count)
                        count = subString.length();
                }
            }

            String subString = coins.substring(0,i);
            if(isAvailable((HashSet<Character>) coinSet.clone(),subString)){
                if(subString.length() < count)
                    count = subString.length();
            }

        }
        System.out.println("Count Here 1 :" + count);
        for(int i=coins.length() -1; i<=0;i--){
            if( (i-coinSet.size()) < coins.length()){
                String subString = coins.substring(i-coinSet.size(),i);
                if(isAvailable((HashSet<Character>) coinSet.clone(),subString)){
                    if(subString.length() < count)
                        count = subString.length();
                }
            }
            String subString = coins.substring(i,coins.length());
            if(isAvailable(coinSet,subString)){
                if(subString.length() < count)
                    count = subString.length();
            }
        }*/
        return count;
    }

    private  static int callCount = 0;

    public  static boolean isAvailable(HashSet<Character> coinSet, String str){
        callCount++;
        for(Character s : str.toCharArray()){
            coinSet.remove(s);
        }
        return coinSet.size() == 0;
    }

}
