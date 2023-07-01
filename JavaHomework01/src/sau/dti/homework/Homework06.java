package sau.dti.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework06 {
    public static void Header(){
        System.out.println("+++++++++++++++");
        System.out.println("  โปรแกรม Bingo V1.2");
        System.out.println("+++++++++++++++");
        System.out.println("ใส่เลข 100 เพื่อใช้สูตรโกงได้นะ... ($_$)");
    }
    
    public static int InputNum(int x){
        Scanner scan = new Scanner(System.in);
        System.out.print("กรุณาป้อนตัวเลขที่ต้องการทาย (0 - 99) : ");
        int y = scan.nextInt();
        System.out.println("+++++++++++++++");
        ShowResult(y, x);
        return y;
    }
    
    public static int RandomNum(){
        Random random = new Random();
        int x = random.nextInt(99);
        return x;
    }
    
    public static void ShowResult(int y, int x){
        if(y == x){
            System.out.println("ตัวเลขที่ทายถูกต้องแล้วคร๊าบบบบบบ... (^v^)");
        } else if(y == 100){
            System.out.println("คุณได้ใช้สูตรโกงแล้ว คำตอบคือ : "+ x);
            InputNum(x);
        } else {
            System.out.println("ตัวเลขที่ทายไม่ถูกต้อง ทายมากไปหรือทายน้อยไป กรุณาทายใหม่...");
            InputNum(x);
        }
    }
    
    public static void main(String[] args) {
        Header();
        int x = RandomNum();
        InputNum(x);
        System.out.println("+++++++++++++++");
    }
}
