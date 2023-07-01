package com.sau.dti;

public class Pen {
    //data member, property member คือ ข้อมูลหรือค่าข้อมูล
    public String color_pen;
    public int long_pen = 20;
    
    //constructor คล้าย method ทำงานทุกครั้งที่มีการสร้าง object
    //Pen(){} <--empty constructor
    //โดยการทำงานส่วนใหญ่มักจะเป็นการกำหนดค่าให้กับ data ที่ยังไม่มีค่า
    public Pen(String color_pen){
        this.color_pen = color_pen; //this ใช้แทนคลาส
    }
    
    public void writePen(String msg){
        System.out.println("เขียนว่า "+ msg);
    }
    
    public void drawPen(String img){
        System.out.println("วาดรูป "+ img);
    }
}
