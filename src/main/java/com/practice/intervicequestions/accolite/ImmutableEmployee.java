package com.practice.intervicequestions.accolite;

import java.util.Date;
import java.util.List;

public final class ImmutableEmployee {

   private final int id;
   private final  String name;
   private final  List<String> projects;
   private final Date doj;

    public ImmutableEmployee(int id, String name, List<String> projects, Date doj) {
        this.id = id;
        this.name = name;
        this.projects = projects;
        this.doj = doj;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getProjects() {
        return projects;
    }

    public Date getDoj() {
        return doj;
    }


}
