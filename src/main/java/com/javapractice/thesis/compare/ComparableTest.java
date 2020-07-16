package com.javapractice.thesis.compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

    public static void main(String args[]){
        EmployeePojo employee1 = new EmployeePojo(1,"name1");
        EmployeePojo employee2 = new EmployeePojo(2,"name2");
        EmployeePojo employee3 = new EmployeePojo(3,"name3");

        ArrayList<EmployeePojo> employeeList = new ArrayList<>();

        employeeList.add(employee2);
        employeeList.add(employee1);
        employeeList.add(employee3);
        System.out.println("Before Sorting :" +employeeList);
        Collections.sort(employeeList);
        System.out.println("After Sorting :" +employeeList);
    }

}
