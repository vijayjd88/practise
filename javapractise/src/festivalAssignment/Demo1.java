package festivalAssignment;

import day2.Read;

public class Demo1 {

    public static void main(String[] args) {

            System.out.println("Enter the choice of festival 1- Ramzan 2- Diwali");
            int ch=Read.sc.nextInt();
            if(ch==1) {
                IFestival ob = new Ramzan();
                ob.readData();
                ob.cal();
                ob.display();
            }
            else if (ch==2) {
                IFestival ob1 = new Diwali();
                ob1.readData();
                ob1.cal();
                ob1.display();
            }

            else{
                System.out.println("Invalid input ");
            }



    }
}
