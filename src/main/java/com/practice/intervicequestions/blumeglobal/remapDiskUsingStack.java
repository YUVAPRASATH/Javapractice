package com.practice.intervicequestions.blumeglobal;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/*
 *  used = {1,2,3}
 *  totalCapacity = {3,3,3} --> partition capacity --> Numbers can be more than used
 *  after Reallocate = {0,3,3}
 */
public class remapDiskUsingStack {
    private static int totalCapacity = 10;

    public static void main(String args[]){
        Stack<Integer> bucket1 = new Stack<>();
        Stack<Integer> bucket2 = new Stack<>();
        Stack<Integer> bucket3 = new Stack<>();
        bucket1.push(2);
       // bucket1.push(1);
        bucket1.push(1);
        bucket1.push(2);

        bucket2.push(2);
        bucket2.push(2);

        findReallocateElement(bucket1,bucket2);
        System.out.println(bucket1);
        System.out.println(totalSize(bucket1));
    }

    public static int totalSize(Stack<Integer> bucket){
        AtomicInteger total = new AtomicInteger();
        bucket.stream().forEach(total::addAndGet);
        return total.get();
    }

    public static void findReallocateElement(Stack<Integer> b1, Stack<Integer> b2){
         int emptySpaceIn_B21 = totalCapacity - totalSize(b2);
          AtomicInteger index = new AtomicInteger();
         b1.stream().forEach(x-> {
                 if(x <= emptySpaceIn_B21){
                     index.set(x);
                 }



        });
         System.out.println("Index :" + index);
    }
}
