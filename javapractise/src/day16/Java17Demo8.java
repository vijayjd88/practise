package day16;

public class Java17Demo8 {
    public static void main(String[] args) {
        ab2 obj = new ab2();
        obj.f1();
        obj.f2();
    }
}

//use of sealed in place of final
sealed class ab1 permits ab2{
    public void f1(){
        System.out.println("I am in f1 ");
    }
}
sealed class ab2 extends ab1 permits ab3{
    public void f2(){
        System.out.println("I am in f2 ");
    }
}
 non-sealed class ab3 extends ab2{
    public void f3(){
        System.out.println("I am in f3 ");
    }
}