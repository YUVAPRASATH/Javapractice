package com.practice.intervicequestions.gehealthcare;

/**
 *  Completed
 */
public class FindMimimumString {
    public static void main(String args[]){
       // String str="aabcccabba";
        String str = "daaaddaad";
        StringBuffer buff = new StringBuffer(str);
        System.out.println(minimumString(str));

    }

    static int minimumString(String str){
        int count = str.length();
        for(int i=1; i<str.length();i++){
       //     System.out.println(str.substring(0,i) + ":" + str.substring(i,str.length()) );
            String tempString = stringSplit(
                    new StringBuffer(str.substring(0,i)),
                    new StringBuffer(str.substring(i,str.length()) )
            );
            System.out.println("finalString =" + tempString + ":"+tempString.length());
            if(tempString.length() < count){
                count = tempString.length();
            }
            System.out.println("====================");
        }
        return count;
    }

    static String stringSplit(StringBuffer left, StringBuffer right){
    //    System.out.println("Left :" + left + ", Right :" + right);
        for(int i =0,j=right.length()-1; i<left.length() && j >= 0;){
            if(left.charAt(i) != right.charAt(j)){
                return  right.append(left).toString();
            }
            if(left.charAt(i) == right.charAt(j)){
                if(i == left.length() - 1 || j == 0){
                    return  stringSplit(left.delete(0, i+1),right.delete(j,right.length()));
                }
                char tempChar = left.charAt(i);
                for(int x = i+1 ; x<left.length();x++){
                    if(left.charAt(x) != tempChar){
                        break;
                    }
                    i++;
                }
                for(int y = j-1 ; y>= 0 ;y--){
                    if(right.charAt(y) != tempChar){
                        break;
                    }
                    j--;
                }
      //          System.out.println("i :" + i + " j :" + j);
                return  stringSplit(left.delete(0, i+1),right.delete(j,right.length()));
            }
        }
        return  right.append(left).toString();
    }
}
