package day2;

public class Assignment2 {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number : ");
        n=Read.sc.nextInt();
        int units= n % 10;
        int tens = (n/10) % 10;
        int hundreds = (n/100) % 10;
        int thousands = (n/1000) % 10;
        int tenThousands=(n/10000) % 10;
        int lacs= (n/100000) % 10;
        System.out.println("The Units digit of " + n + "is : "+ units);
        System.out.println(" The tens digit of " + n +" is: " + tens);
        System.out.println(" The hundreds digit of " + n +" is :"+hundreds);
        System.out.println(" The thousands digit of " + n +" is :"+thousands);
        System.out.println(" The ten thousandth digit of " + n + " is :" +tenThousands);
        System.out.println(" The digit at lacs place of " + n + " is :"+lacs);

    }

}
