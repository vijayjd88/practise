package day7;

public class Demo2 {
    public static void main(String[] args) {
        Airthmatic obj = new Addition();//liskov substituion principal  Here referenec is of superclass obj of sub class
         call(obj);
         obj = new Subtraction();
         call(obj);
    }

    public static void call(Airthmatic obj){
        obj.readData();
        obj.calData();
        obj.display();
    }
// display the date of deepavali and ramzan for next 10 years

}
