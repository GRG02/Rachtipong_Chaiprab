package com.dti.BB;

//this(para.) คือ เรียกใช้ constructor ของคลาสตัวเอง
//super(para.) คือ เรียกใช้ constructor ของคลาสแม่
//ข้อแม้ในการใช้งาน ต้องถูกเรียกใช้เป็นคำสั่งแรกจาก constructor หนึ่งๆ เท่านั้น

public class TestE extends TestD {
    
    public TestE(){
        super(10, 20);
        System.out.println("222");
    }
    
    public TestE(int x){
        this();
        System.out.println(x);
    }
    
    public void show(){
    }
}
