package Day17Streams;
// inner class without static method
import java.util.function.Predicate;

class Student1{
    String sid ;
    String name;
    String city;

    public Student1() {
    }

    public Student1(String sid, String name, String city) {
        this.sid = sid;
        this.name = name;
        this.city = city;
    }

    void displayData(){
        System.out.println("id = " + this.sid + " Name  = " + this.name+"   City  =  " +this.city);
    }

    class Marks{
        Integer testNo;
        Integer Marks;

        public Marks() {
        }

        public Marks(Integer testNo, Integer marks) {
            this.testNo = testNo;
            Marks = marks;
        }

       void displayMarksName(){
           displayData();
           System.out.println(" Test No  = " +  this.testNo + "   Marks  "+ this.Marks);

       }
       void displayResult(){
           displayMarksName();
           System.out.println((Marks < 35)?"Fail":"Pass");

       }

    }

}
public class Demo4InnerClass {
    public static void main(String[] args) {
        Student1 stud = new Student1("s1001" , "Sachin Tendulkar" , "Mumbai" );
        Student1.Marks marks= stud.new Marks(1 , 50);
        System.out.println("............ ");
        stud.displayData();
        System.out.println("............ ");
        marks.displayMarksName();
        System.out.println("............ ");
        marks.displayResult();




    }

}
