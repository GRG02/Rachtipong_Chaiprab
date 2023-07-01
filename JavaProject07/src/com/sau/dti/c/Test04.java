package com.sau.dti.c;

public class Test04 {
    //data
    public int x;
    public int y = 20;
    
    //constructor ** ไม่ใช่องค์ประกอบของ class/object
    //constructor ทำงานทุกครั้งที่มีการสร้าง object
    //empty constructor จะสร้างให้เองเมื่อเราไม่ได้สร้าง construtor เอง
    //เมื่อ 1 คลาสมี constructor มากกว่า 1 ตัว เรียก "overloading constructor"
    public Test04(){
        System.out.println("hi");
    }
    private Test04(int x){}
    protected Test04(int x, int y, int z){
        System.out.println("hey");
    }
    Test04(int x, int y){}
    
    //method
    public void showX(){
        System.out.println(x);
    }
    
    public void showX(int wow){
        System.out.println(x);
    }
    
    public void showY(String wow){
        System.out.println(y);
    }
}
