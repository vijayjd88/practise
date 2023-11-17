package day5;

public class Demo3 {
    public static void main(String[] args) {

        PrimeRange ob=new PrimeRange();
        ob.readData();
        int x[]=ob.returnPrime();
        for(int y: x){
            if(y!=0)
                System.out.println(y);
        }
    }
}
