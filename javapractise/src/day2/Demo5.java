package day2;
public class Demo5 {
    public static void main(String[] args) {
        int n;
        final int x = 1;
        System.out.println("enter choice ");
        n = Read.sc.nextInt();
        switch (n){
            default:
                System.out.println("wrong input ");
                break;
            case x:
                System.out.println("choice is one ");
                break;
            case 2:
                System.out.println("choice is two");
                break;
            case 3:
                System.out.println("choice is three");
                break;
        }
    }
}