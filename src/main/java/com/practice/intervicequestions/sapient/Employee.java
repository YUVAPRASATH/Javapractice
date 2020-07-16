package com.practice.intervicequestions.sapient;

public class Employee {
    private String name;
    private long salary;
    private Company company;

    public Employee(String name, long salary, Company company) {
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Company getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
