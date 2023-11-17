package day6;

public class EnCapDemo {

    int a=10; //default member
    private int b=20;
    protected int c=30;
    public int d=40;

    void f1(){
        System.out.println(" I am in f1");
    }

    private void f2(){
        System.out.println("This is a private method ");
        System.out.println(b);
    }

    protected void f3(){
        System.out.println("This is a protected method");
    }

    public void f4(){
        System.out.println("This is a public method");
    }

}
