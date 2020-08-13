package com.javapractice.thesis.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {
    public static void main(String args[]){
        Executor executor = Executors.newFixedThreadPool(10);
        Executor executor1 = Executors.newSingleThreadScheduledExecutor();
     //   executor1.

        Runnable r = ExecutorMain::run;
        Callable c;
        System.out.println("TEst");
        executor.execute(r);
    }

    private static void run() {
        System.out.println("IN Runnable");
    }
}
