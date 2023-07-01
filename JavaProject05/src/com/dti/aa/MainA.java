package com.dti.aa;

public class MainA {
    public static void main(String[] args) {
        TestA ob1 = new TestA(10, 5.5, "Wow");
        TestA ob2 = new TestA(20, 5.5, "Hello");
        TestA ob3 = new TestA();
        
        System.out.println(ob1.getNumberDti1());
        ob1.setNumberDti1(500);
        System.out.println(ob1.getNumberDti1());
    }
}
