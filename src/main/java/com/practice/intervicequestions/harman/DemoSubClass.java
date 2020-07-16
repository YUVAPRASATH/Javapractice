package com.practice.intervicequestions.harman;

public class DemoSubClass extends Demo{

    public void add(){
    }

    public void multiply(){
    }

    public static void main(String args[]){
        Demo obj = new DemoSubClass();
        obj.add();
        // Cannot access subClass methods
        // add.multiply()
        DemoSubClass obj2 = new DemoSubClass();
        obj2.multiply();

        Demo demo = new Demo();
     //   demo.;
    }
}
