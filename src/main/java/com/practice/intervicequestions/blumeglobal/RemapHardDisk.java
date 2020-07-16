package com.practice.intervicequestions.blumeglobal;

import java.util.ArrayList;
import java.util.List;

/**
 * Reallocate stored data in hardDisk Partition in order to free-up partitions.
 * Print used partitions
 *  used = {1,2,3}
 *  totalCapacity = {3,3,3} --> partition capacity --> Numbers can be more than used
 *  after Reallocate = {0,3,3}
 *   Output -> 2 partitions needed
 *   TODO : INCOMPLETE
 */
public class RemapHardDisk {

    public static void main(String args[]){
        ArrayList<Integer> used = new ArrayList<>();
        used.add(1);
        used.add(1);
        used.add(1);
        ArrayList<Integer> total = new ArrayList<>();
        total.add(3);
        total.add(3);
        total.add(3);
        System.out.println(minPartitions(used,total));

    }

    public static int minPartitions(List<Integer> used, List<Integer> totalCapacity) {

        int arraySize = used.size();
        int count = arraySize;
        Integer[] usedArr = new Integer[arraySize];
        usedArr = used.toArray(usedArr);

        Integer[] totalArr = new Integer[arraySize];
        totalArr = totalCapacity.toArray(totalArr);

        for(int x =0 ; x< arraySize;x++){
            System.out.print(usedArr[x] + ",");
        }
        System.out.println();
        for(int i = 0 ; i < arraySize;i++) {
            for (int tempGap = 0; tempGap < totalArr[i]; tempGap++) {
                usedArr = minimumDifference(usedArr, totalArr, tempGap);
            }
        }

        for(int x =0 ; x< arraySize;x++){
            System.out.print(usedArr[x] + ",");
        }
        System.out.println();
        for(int x =0 ; x< arraySize;x++){
            System.out.print(totalArr[x] + ",");
        }
        System.out.println();

        for(int x =0 ; x< arraySize;x++){
            if(usedArr[x]==0){
                count--;
            }
        }
        return count;
    }

    static Integer[] minimumDifference(Integer[] usedArr, Integer[] totalArr, int minimumGap){
        int arraySize = usedArr.length;
        for(int i =  0 ; i < arraySize ; i++){
            if(usedArr[i] ==0){
                continue;
            }
            for(int j =0; j < arraySize;j++){
                if( usedArr[i] != 0
                        && usedArr[j] !=0
                        && (usedArr[i] + usedArr[j] - totalArr[j] == minimumGap)){
                    usedArr[j] = usedArr[i] + usedArr[j];
                    usedArr[i] = 0;
                }
            }
        }
        return usedArr;
    }

}
