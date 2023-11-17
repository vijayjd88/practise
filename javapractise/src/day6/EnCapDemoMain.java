package day6;

public class EnCapDemoMain {

    public static void main(String[] args) {
        EnCapDemo ob=new EnCapDemo();
        System.out.println(ob.a);
       //System.out.println(ob.b); We cannot access outside the class as it is a private attribute
        System.out.println(ob.c);
        System.out.println(ob.d);
        ob.f1();
       // ob.f2(); We cannot access this as this is a private method
        ob.f3();
        ob.f4();
    }
}
