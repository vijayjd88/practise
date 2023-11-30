package day14;

public class RecursiveDemo {
    public static void main(String[] args) {

        System.out.println(calfact(5));

    }
    public static int calfact(int n){

        if (n==1){
            return 1;
        }
        return n*(calfact(n-1));
    }
}
