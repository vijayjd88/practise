package Day17Streams;
// inner class with static methods
class Student2{
    String sid ;
    String name;
    String city;

    public Student2() {
    }

    public Student2(String sid, String name, String city) {
        this.sid = sid;
        this.name = name;
        this.city = city;
    }

     void displayData(){
        System.out.println("id = " + this.sid + " Name  = " + this.name+"   City  =  " +this.city);
    }

    static class Marks{
        Integer testNo;
        Integer Marks;
    Student2 student2;
        public Marks() {

        }

        public Marks(Integer testNo, Integer marks, Student2 obj) {

            this.testNo = testNo;
            Marks = marks;
            this.student2 = obj;
        }

         void displayMarksName(){

            student2.displayData();
            System.out.println(" Test No  = " +  this.testNo + "   Marks  "+ this.Marks);

        }
        void displayResult(){
            displayMarksName();
            System.out.println((Marks < 35)?"Fail":"Pass");

        }

    }

}
public class Demo5InnerClass {
    public static void main(String[] args) {
        Student2 stud = new Student2("s101" , "Sachin Tendulkar" , "Mumbai");
        Student2.Marks m1 = new Student2.Marks(1,25, stud);
        stud.displayData();
        m1.displayMarksName();
        m1.displayResult();




    }

}
