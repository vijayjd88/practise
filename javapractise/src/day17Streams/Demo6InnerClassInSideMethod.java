package Day17Streams;

// without static and using  class inside the method
class Student3{
    String sid;
    String name;
    String city;

    public Student3() {
    }

    public Student3(String sid, String name, String city) {
        this.sid = sid;
        this.name = name;
        this.city = city;
    }


    void  displayMethod(int testNo , int marks){
        class Marks{
            Integer testNo ;
            Integer Marks;

            public Marks() {
            }

            public Marks(Integer testNo, Integer marks) {
                this.testNo = testNo;
                Marks = marks;
            }

            void displayMethod(){
                System.out.println("Test No =  " + testNo + " Marks = "+ marks);

            }

        }
        Marks obj = new Marks(testNo ,marks);
        System.out.println( " Id  = " + sid + " name  =  " + name + "  city = " +city);
        obj.displayMethod();


    }

}
public class Demo6InnerClassInSideMethod {

    public static void main(String[] args) {
        Student3 stud  = new Student3("s101" , "Sachin Tendulakr" , "Mumbai");
        stud.displayMethod(1,40);



    }

}
