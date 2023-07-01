package sau.dti.homework;

import java.util.Scanner;

public class Homework07 {
    public static void Header(){
        System.out.println("+++++++++++++++");
        System.out.println("   โปรแกรมแม่สูตรคูณ");
        System.out.println("+++++++++++++++");
    }
    
    public static int InputValue(){
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนแม่สูตรคูณที่ต้องการ : ");
        int Time = scan.nextInt();
        System.out.println("+++++++++++++++");
        return Time;
    }
    
    public static void ShowTimeColumn(int Time){
        int i;
        for(i = 1; i <= 12; i++){
            System.out.format(i + " x " + Time + " = %d\n", i*Time );
        }
        System.out.println("+++++++++++++++");
    }
    
    public static void main(String[] args) {
        Header();
        int Time = InputValue();
        ShowTimeColumn(Time);
    }
}
