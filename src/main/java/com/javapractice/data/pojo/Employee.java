package com.javapractice.data.pojo;

public class Employee{
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}