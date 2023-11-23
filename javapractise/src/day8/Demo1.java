package day8;
class a1 {
    public a1() {
        System.out.println(" I am in super class zero argument constructor ");
    }

    public a1(int x) {
        System.out.println(" I am in super class One argument constructor " + x);
    }

}

class a2 extends a1 {
    public a2() {
        this(10,20);
        System.out.println(" I am in sub class zero argument constructor ");
    }

    public a2(int x) {
        super(x);
        System.out.println(" I am in sub class One argument constructor " + x);

    }
    public a2(int x, int y){
        
        System.out.println("I ama in  sub class two argument constructor " + x +"  " + y);
    }

}





public class Demo1 {

    public static void main(String[] args) {
        a2 ob = new a2();
    }
}
