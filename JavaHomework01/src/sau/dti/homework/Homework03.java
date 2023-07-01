package sau.dti.homework;

import java.util.Scanner;

public class Homework03 {
    public static void Header(){
        System.out.println("======================");
        System.out.println(" โปรแกรมสอบถามข้อมูลสายรถเมล์");
        System.out.println("======================");
    }
    
    public static int LineInput(){
        System.out.print("กรุณาป้อนสายรถเมล์ : ");
        Scanner scan = new Scanner(System.in);
        int BusLineNum = scan.nextInt();
        System.out.println("======================");
        return BusLineNum;
    }
    
    public static void ShowDestination(int BusLineNum){
        switch(BusLineNum){
            case 57: System.out.println("ไปสะพานปิ่นเกล้า");
            break;
            case 3: System.out.println("ไปสนามหลวง");
            break;
            case 71: System.out.println("ไปหัวลำโพง");
            break;
            case 56: System.out.println("ไปบางลำพู");
            break;
            case 539: System.out.println("ไปอนุสวรีย์ชัยฯ");
            break;
            default : System.out.println("ไม่มีข้อมูล");
        }
        System.out.println("======================");
    }
    
    public static void main(String[] args) {
        Header();
        int BusLineNum = LineInput();
        ShowDestination(BusLineNum);
    }
}
