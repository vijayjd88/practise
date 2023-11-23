package day70;

public class Demo2 {
    public static void main(String[] args) {
        IAirthmatic obj = new Addition();//liskov substituion principal. Here reference is of superclass obj of sub class
         call(obj);
        obj = new Subtraction();
        call(obj);
    }

    public static void call(IAirthmatic obj){
        obj.readData();
        obj.calData();
        obj.display();
    }


}
