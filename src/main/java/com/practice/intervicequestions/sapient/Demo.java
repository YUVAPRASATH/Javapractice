package com.practice.intervicequestions.sapient;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class Demo {

    private final List<Employee> employeeList = new ArrayList<Employee>();
   // HashMap<Employee> employeeHashMap;
    HashMap<Company, HashSet<Employee>>  employeeMap = new HashMap<Company,HashSet<Employee>>();
    //

    public  static void main(String args[]){

        Demo demoObj = new Demo();
        demoObj.hashCode();

        Company company1 = new Company("Company1","owner1");
        Company company2 = new Company("Company1","owner1");

        Company clone = company1;

        if(clone==company1){
            System.out.println("same Company");
        }

        System.out.println("Demo Hashcode :" + company1.hashCode());
        System.out.println("Demo Hashcode :" + company2.hashCode());

        company1.setName("New Company");
        System.out.println("Demo Hashcode :" + company1.hashCode());

        if(clone==company1){
            System.out.println("same Company");
        }

        //demoObj.equals();
        demoObj.addEmployee(new Employee("employee1",150000L, new Company("Company1","1owner")) );
        demoObj.addEmployee(new Employee("employee2",10000L, new Company("Company2","2owner")) );
        demoObj.addEmployee(new Employee("employee3",250000L, new Company("Company1","1owner")) );
        demoObj.addEmployee(new Employee("employee4",90000L, new Company("Company1","1owner")) );

        HashSet<Employee> employeeHashSet = demoObj.getEmployee(new Company("Company1","1owner"));

        demoObj.getEmployeeWithHeightSalary();
       System.out.println("Size :" + employeeHashSet.size());

    }
   public void addEmployee(Employee employee){
        employeeList.add(employee);

       HashSet<Employee> employeeHashSet = employeeMap.get(employee.getCompany());
       if(employeeHashSet == null){
           employeeHashSet = new HashSet<Employee>();
           employeeHashSet.add(employee);
           employeeMap.put(employee.getCompany(), employeeHashSet);
       }else{
           employeeHashSet.add(employee);
           employeeMap.put(employee.getCompany(), employeeHashSet);
       }
   }

   public HashSet<Employee> getEmployee(Company company){

  /*     Collections.
       employeeList.stream().filter(x-> x.getCompany().getName().equals(company.getName())).collect(Collectors.toList());
       return  null;*/

    //   employeeList.stream().max()

     //  Integer.compare()
       Comparator.reverseOrder();

      return employeeMap.get(company);
   }


   public Employee getEmployeeWithHeightSalary(){
       final long[] heightSalary = {0L};
     //   employeeList.stream().collect(toMa)
   //    employeeList.stream().collect(Collectors.summingLong())
        System.out.println(heightSalary[0]);
      // employeeList.stream().ma

        return null;
   }

}

