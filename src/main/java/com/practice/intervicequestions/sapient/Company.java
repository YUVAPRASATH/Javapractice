package com.practice.intervicequestions.sapient;

import com.sun.org.apache.xpath.internal.objects.XObject;

public class Company {

    private String name;
    private String owner;

    public Company(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object company) {

        return (this.name ==((Company) company).name);
    }

    @Override
    public int hashCode(){
        return  name.charAt(0);
    }

}
