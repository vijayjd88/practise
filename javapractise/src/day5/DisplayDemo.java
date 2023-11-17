package day5;

public class DisplayDemo {
    public static void main(String[] args) {
        SelectionSort ob=new SelectionSort();
        int b[]=new int[5];


        ob.readData();
        b=ob.SelSort();
        for(int x:b){
            System.out.println(x);
        }

    }
}
