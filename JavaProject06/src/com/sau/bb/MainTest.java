package com.sau.bb;

public class MainTest {
    public static void main(String[] args) {
        Test012 dti1 = new Test012();
        Test012 dti2 = new Test012();
        Test012 dti3 = new Test012();
        
        dti1.dataA = 999;
        System.out.println(dti1.dataA);
        dti2.metA();
        Test012.dataB = 555;
        System.out.println(dti1.dataB);
        System.out.println(dti2.dataB);
        System.out.println(dti3.dataB);
        Test012.metB();
        dti1.metB();
        dti2.metB();
        dti3.metB();
    }
}
