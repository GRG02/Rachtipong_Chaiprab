package sau.dti.homework;

import java.util.Scanner;

public class Homework05 {
    public static void Header(){
        System.out.println("-------------------------");
        System.out.println("  โปรแกรม Food Fat");
        System.out.println("-------------------------");
    }
    
    public static void InputTime(){
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนจำนวนอาหารที่จะตรวจสอบ : ");
        int i, Time = scan.nextInt();
        System.out.println("-------------------------");
        for (i = 1; i <= Time; i++){
            showResult(i);
        }
    }
    
    public static void showResult(int i){
        Scanner scan = new Scanner(System.in);
        System.out.println("ลำดับที่ "+ i);
        System.out.print("ป้อนชื่ออาหาร : ");
        String MealName = scan.next();
        System.out.print("ป้อนแคลอรี่ : ");
        float MealCal = scan.nextFloat();
        
        if(MealCal > 1000.57){
            System.out.println("อาหารทำให้อ้วน :( ");
        } else {
            System.out.println("อาหารไม่ทำให้อ้วน :) ");
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Header();
        InputTime();
        System.out.println("-------------------------");
    }
}
