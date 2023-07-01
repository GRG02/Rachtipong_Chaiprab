package com.sau.dti;

public class DtiTest01 {
    public static void main(String[] args) {
        //สร้าง Object/Instance
        //วิธีที่ 1 ทำ 2 คำสั่ง
        Pen sau_a; //<-- ประกาศ/สร้างชื่อ Object
        sau_a = new Pen("แดง"); //<-- เอาชื่อที่ประกาศมาสร้างเป็น Object ด้วยคำสั่ง new
        
        //วิธีที่ 2 ทำคำสั่งเดียว
        Pen sau_b = new Pen("ดำ");
        
        Pen sau_c = new Pen("แดง");
        
        Square wow_a = new Square();
        Square wow_b = new Square();
        
        //การนำ object ไปใช้งาน
        System.out.println(sau_b.long_pen);
        System.out.println(sau_c.color_pen);
        sau_c.color_pen = "น้ำเงิน";
        System.out.println(sau_c.color_pen);
        sau_a.writePen("I Love You");
    }
}
