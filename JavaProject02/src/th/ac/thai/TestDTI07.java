package th.ac.thai;

public class TestDTI07 {
    //overloading method
    public static void met1(int x) {}   
    public static void met1(double x) {}   
    public static void met1(double x, int y) {}   
    
    public static void met1() {
        System.out.println("AAA");
        //return; ไม่มีก็ได้
        System.out.println("Wow Wow Wow");
        met2("SAU",100);
    }
    
    public static void met2(String a, int b) {
        b = b * 10;
        System.out.println("BBB" + a + b);
        //return; ไม่มีก็ได้
    }
    
    public static String met3() {
        System.out.println("CCC");
        return "Hi...Hey...Hum...";
    }
    
    public static int met4(int x, int b) {
        int z = x + b ;
        return z;
    }
    
    public static void main(String[] args) {
        met1(15.00,15);
        //met3(); เขียนได้ แต่ไม่ทำกัน
        System.out.println( met3() );
        met1();
    }
}
