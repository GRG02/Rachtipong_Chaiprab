package com.sau.dti;

import java.util.Scanner;

public class Square {
    public double wi = 0, lo = 0, area = 0;
    
//    public Square(){
//        System.out.println("Hello....");
//    }
    
    public void inputWiLo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ป้อนความกว้าง : ");
        wi = sc.nextDouble();
        System.out.println("ป้อนความกว้าง : ");
        lo = sc.nextDouble();
    }
    
    public void calArea(){
        area = wi * lo;
    }
    
    public void showArea(){
        System.out.println("พื้นที่สี่เหลี่ยมเป็น "+area);
    }
}
