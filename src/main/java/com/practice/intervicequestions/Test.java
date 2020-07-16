package com.practice.intervicequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 Fail
 Found:    "000100100100"
 Expected: "000100101000"

 000001100011

 Fail
 Found:    "000001100011"
 Expected: "000100101000"
 */

/**
 *
 * Mimimum 3 ingredients for a dish
 * ingredients cannot be same
 * Minimum 2 ingredients of same category
 */
public class Test {
    public static void main(String args[]){
       List<String> categoriesList = Arrays.asList("FIBER","FAT","CRAB");
     //   List<String> ingredientsInput = Arrays.asList("FIBER1","FAT1","CRAB1","FIBER2","FAT2","FIBER3","CRAB2","FIBER4","CRAB3","FIBER5","SCRAB4","FAT2");
          List<String> ingredientsInput = Arrays.asList("FIBER1","FIBER2","FIBER1","FIBER3","FIBER4","CRAB1");
          // 00010
       // System.out.println(catagories);
      //  Scanner in = new Scanner(System.in);
        int numberOfDays = ingredientsInput.size();
        ArrayList<String> ingredientList = new ArrayList<String>();
        for (int i = 0; i < numberOfDays; i++) {
            String ingredient = ingredientsInput.get(i);
            ingredientList.add(ingredient);
          //  System.out.println();
            System.out.println(ingredientList);
            if(ingredientList.size() <= 2) {
                System.out.print(0);
                continue;
            }
            String categoryForDish = null;
            boolean found = false;
            for ( String category : categoriesList) {
                int ingredientsCount = 0;
                for (String j : ingredientList) {
                    if(j.contains(category)){
                        ingredientsCount++ ;
                    }
                }
                if(ingredientsCount >= 2){
                    categoryForDish = category;


                    if(ingredientsCount<ingredientList.size()){
                        ArrayList<String> newIngredientList = new ArrayList<String>();
                        System.out.print(1);
                        found=true;
                        if(ingredientsCount==2) {

                            for (String k : ingredientList) {
                                int tempCount = 0;
                                if(tempCount<=2) {
                                    if (k.contains(categoryForDish)) {
                                        tempCount++;
                                        continue;
                                    }
                                }
                                newIngredientList.add(k);
                            }
                            for (int x = 0; x<newIngredientList.size(); x++){
                                if(newIngredientList.get(x).contains(category)){
                                    continue;
                                }else{
                                    newIngredientList.remove(x);
                                    break;
                                }
                            }
                            ingredientList = newIngredientList;
                        }else{
                            // different approach
                        }
                        continue;
                    }else {
                       // System.out.print(0);
                    }


                }else{
                    // only one time

                }
            }
            if(!found)
                System.out.print(0);
          //  System.out.println(ingredientList);
        }

        System.out.println();
        System.out.println(ingredientList);
    }
}
