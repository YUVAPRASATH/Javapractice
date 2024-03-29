package com.utilities.xmlparser;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlType(propOrder={"id", "firstName", "lastName","department"})

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String firstName;
    private String lastName;
    private Department department;

    public Employee() {
        super();
    }

    public Employee(int id, String fName, String lName, Department department) {
        super();
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.department = department;
    }


    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + "," +
                " lastName=" + lastName + ", department="+ department + "]";
    }
}
