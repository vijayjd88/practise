package day2;
public class Demo6 {
    public static void main(String[] args) {
        n1:
        for(int j = 1; j<21; j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(j+"  x "+i +"  =  " + (j*i));
            }
            System.out.println("--------------------------");
        }
        System.out.println("while loop ---------------------");
        int x = 0;
        while(x<10) {
            System.out.println(x);
            x++;
        }
        System.out.println("-------------------------do while loop ");
        x = 1;
        do{
            System.out.println(x);
        } while (!(x==1));
    }
}


/*    Assignment
        To sum series 1+ 2+ 3+ ………n
        To display units , tens, …… lakhs for a given number ex 24 unit = 4 ten 2
        To display 1 to 31 with suffix 1st, 2nd ….4th
        To check a number is prime or not
        To compute income tax for a given amount base on slab
<5l no tax
<10 10%
< 15  15%
<20  20%
        >20 30% */