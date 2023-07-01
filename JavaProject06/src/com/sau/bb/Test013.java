package com.sau.bb;

public class Test013 {
    public void metA(){}
    
    public void metB(){}
    
    public static void metC(){}
    
    public static void metD(){}
    
    public void testMet1(){
    metA(); //ไม่เป็น static เรียกใช้ไม่เป็น static ได้
    metB();
    metC(); //ไม่เป็น static เรียกใช้ที่เป็น static ได้
    metD();
    }
    
    public static void testMet2(){
    //metA(); error //เป็น static เรียกใช้ไม่เป็น static ไม่ได้
    //metฺB(); error
    metC(); //เป็น static เรียกใช้ที่เป็น static ได้
    metD(); //เป็น static เรียกใช้ที่เป็น static ได้
    }
}
