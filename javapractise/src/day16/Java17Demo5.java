package day16;


import day2.Read;

// We are seeing the difference of switch case statement
// We need not use break statement
// We can also use lambda expression
// In case statement along with the integer and character constant , we can also use string constant
public class Java17Demo5 {

    public static void main(String[] args) {


        int ch = 0;
        System.out.println("Enter the choice ");
        ch= Read.sc.nextInt();
        switch(ch)
        {
            case 1-> {
                System.out.println(" Choice is one");
            }
            case 2 -> System.out.println(" Choice is two ");
            default -> System.out.println("Invalid Choice");
            case 3 -> System.out.println(" Choice is three");
        }
    }
}
