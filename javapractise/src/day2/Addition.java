
package day2;
        import java.util.Scanner;
public class Addition {   // Addition is a class name also represent the entity
    // properties of the Addition is
    int num1 =90 ;
    int num2;
    int num3;
    // behaviours : by creating a method  or function
    //GOOD practice is one method should not do multiple task or work
    public void readData(){
        System.out.println("enter two number ");
        Scanner sc = new Scanner(System.in);  // sc is local variable which is recognized in this method only
        //  int num1 = 10; //method variable has high priority
        // System.out.println(num1);
        //  System.out.println(this.num1 );
        this.num1 = sc.nextInt();
        this.num2 = sc.nextInt();
    }
    public void calAddition(){
        this.num3 = this.num1 + this.num2;
    }
    public void display(){
        System.out.println("num1 = " + this.num1 +" Num2 = " + this.num2 + " sum = " + this.num3);
    }
}