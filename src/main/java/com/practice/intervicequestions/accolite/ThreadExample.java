package com.practice.intervicequestions.accolite;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.*;

public class ThreadExample {
    public static void main(String args[]) throws Exception {


      /*  Thread t1 = new ThreadOne();
        Thread t2 = new ThreadTwo();*/

/*        for(int i =0;i<10;i++){
            t1.start();
            t2.start();
        }*/
        StudentCallable student = new StudentCallable(1, "aaa");

        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Future<Integer> integerFuture = executorService.submit(student);
        System.out.println("Integer Value :" + integerFuture.get());
    }
}

/*
class ThreadOne extends Thread{
    private int i = 0;
    @Override
    public void run() {
        System.out.println("Even :" + i);
        i = i+2;
    }

}

class ThreadTwo extends Thread{
    private int i = 1;
    @Override
    public void run() {
        System.out.println("Odd :" +i);
        i = i+2;
    }

}*/
