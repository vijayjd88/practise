package day4;

public class Employee {
    String fname;
    String salary;

    public Employee() {
    }

    public Employee(String fname, String salary) {
        this.fname = fname;
        this.salary = salary;
    }
    

    public void display(){
        System.out.println("Name = "+ fname + " Salary" + salary);
    }
}
