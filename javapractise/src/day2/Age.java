package day2;

public class Age {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        int age = Read.sc.nextInt();
        if (age>0 && age<13){
            System.out.println("You are a Child");
        }
        else if(age>=13 && age<20 ){
            System.out.println("You are a teenager");

        }
        else if(age>=20 && age<50){
            System.out.println("You are in your youth");
        }
        else if (age>=50 && age<70){
            System.out.println("You are middle aged");
        }
        else if (age>=70){
            System.out.println("You are old");
        }
        else{
            System.out.println("Enter a valid input");
        }
    }
}
