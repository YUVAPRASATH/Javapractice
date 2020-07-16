package com.utilities.xmlparser;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name="department")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;

    public Department() {
        super();
    }

    public Department(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @XmlAttribute
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
