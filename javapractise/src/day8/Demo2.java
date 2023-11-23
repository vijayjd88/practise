package day8;

class aa1{
    public aa1() {
        System.out.println("I am in constructor of aa1");
    }

    public void read1(){
        System.out.println("I am in read of a1");
    }
}

class aa2 extends aa1 {
    public aa2() {
        System.out.println("I am in constructor of aa2");
    }
    public void read(){
        System.out.println("I am in read of a2");
    }
}
class  aa3 extends aa2 {
    public aa3() {
        System.out.println("I am in constructor of aa3");
    }
public void read(){

    super.read();

        //System.out.println("I am in read of a3");

        }
        }
public class Demo2 {
    public static void main(String[] args) {
        aa3 obj = new aa3();
        obj.read1();
    }
}
