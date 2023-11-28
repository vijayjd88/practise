package day12;

public class Demo1 {

    public static void main(String[] args) {
        ThreadClass t1=new ThreadClass();
        ThreadClass t2=new ThreadClass(15, "Wipro");
        ThreadClass t3=new ThreadClass(20, "Infosys");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(" I am in main ");
    }
}
