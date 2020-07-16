package com.practice.intervicequestions.harman;

public class Demo implements InterfaceA, InterfaceB {

    @Override
    public void add() {
        System.out.print("Add in Demo Class");
    }

    @Override
    public void subtract() {
        System.out.print("Subtract in Demo Class");

    }

    public void multiply(){
        System.out.print("Multiply in Demo Class");

    }

    public static void main(String arg[]){
        InterfaceA interfaceA = new Demo();
        interfaceA.add();
        interfaceA.subtract();
        // Multiply is not accessable

        InterfaceB interfaceB = new Demo();
        interfaceB.multiply();
        // Subtract is not accessable

        Demo demo = new Demo();
        demo.multiply();

    }


}
