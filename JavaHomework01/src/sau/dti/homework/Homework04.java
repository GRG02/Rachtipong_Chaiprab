package sau.dti.homework;

import java.util.Scanner;

public class Homework04 {

    public static void Header() {
        System.out.println("-------------------------");
        System.out.println("โปรแกรม Mutiple 800");
        System.out.println("-------------------------");
    }

    public static int ValueInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขตัวที่ 1 : ");
        int value1 = scan.nextInt();
        System.out.print("ป้อนตัวเลขตัวที่ 2 : ");
        int value2 = scan.nextInt();
        System.out.println("-------------------------");
        int result = value1 * value2;

        ShowResult(result);
        Calto800(result);

        return result;
    }

    public static void ShowResult(int result) {
        System.out.println("ผลคูณเป็น : " + result);
        System.out.println("-------------------------");
    }

    public static void Calto800(int result) {
        if (result >= 800) {
        } else {
            ValueInput();
        }
    }

    public static void main(String[] args) {
        Header();
        ValueInput();
    }
}
