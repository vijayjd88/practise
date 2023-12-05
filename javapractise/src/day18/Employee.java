package day18;
import day2.Read;

import java.io.Serializable;
public class Employee implements Serializable {

        String eid;
        String name;
        Double sal;

    public void readData(){
        System.out.println("Enter Employee details -EID,Name");
        eid= Read.sc.nextLine();
        name=Read.sc.nextLine();

    }
    public void calData(){
        this.sal=100d;
        this.sal=(this.sal)+(this.sal*0.1);
    }
    public void displayData(){
        System.out.println("Mr  " +this.name + " having employee ID "+ this.eid+"has salary : "+this.sal);

    }
}

