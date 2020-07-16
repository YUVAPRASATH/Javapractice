package com.javapractice.thesis.compare;

public class EmployeePojo  implements java.lang.Comparable<EmployeePojo> {
    private int id;
    private String name;

    public EmployeePojo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(EmployeePojo o) {
        return this.id-o.id;
    }

    public String toString(){
        return "Employee--> id: " + this.id + " name : " + this.name;
    }
}

