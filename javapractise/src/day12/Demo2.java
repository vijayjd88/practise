package day12;

public class Demo2 {

    public static void main(String[] args) throws Exception {
        TicToc obj=new TicToc();
        Player1 p1=new Player1(obj);
        Player2 p2=new Player2(obj);
        p1.start();
        p2.start();
        p1.join();
        p2.join();
        System.out.println("Mudinjichu da");
    }
}
