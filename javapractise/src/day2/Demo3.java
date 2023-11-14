package day2;
public class Demo3 {
    int a = 10;
    static int b =20;
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        System.out.println(obj.a);
        System.out.println(b);
        obj.f1();
        f2();
    }
    public void f1(){
        System.out.println("I am in f1");
        System.out.println(this.a);
    }
    public static void f2(){
        System.out.println("I am in f2");
    }
}