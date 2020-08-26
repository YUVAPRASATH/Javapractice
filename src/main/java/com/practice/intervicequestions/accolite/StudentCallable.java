package com.practice.intervicequestions.accolite;

import java.util.concurrent.Callable;

public class StudentCallable implements Callable<Integer> {

    private int id;
    private String name;

    public StudentCallable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable for ID :" + id);
        return id;
    }
}
