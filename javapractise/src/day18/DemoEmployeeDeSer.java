package day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DemoEmployeeDeSer {
    public static void main(String[] args) {
        try {
            Employee emp;
            FileInputStream fis=new FileInputStream("Serialization3");
            ObjectInputStream ois=new ObjectInputStream(fis);
            emp=(Employee)ois.readObject();
            emp.displayData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }
    }
}
