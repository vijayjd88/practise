package org.jpmc.training.main;

import org.jpmc.training.to.StudentTO;

public class Demo1TO {
    public static void main(String[] args) {
        StudentTO obj= new StudentTO("S1001", "Sachin Tendulkar");
        StudentTO obj1= obj;
        StudentTO obj2= new StudentTO("S1002", "Sachin Tendulkar");
        if(obj==obj1){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        if(obj==obj2){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        if(obj.equals(obj2)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
