package day10;
/*
 Generics mean creating a class with the data type but when we create the object the data type will be give  here the same class can be utilized for different data type instead of creating different class for different data type
	Note : Generics are use for storage purpose but should not do much calculation

 */
class Temp<T>{

    T a, b;

    public void setData(T x, T y){
        a = x;
        b = y;
    }

    public void display(){
        System.out.println(a + "  " + b);
    }
}

class Temp1<T,T1>{

    T a;
    T1 b;

    public void setData(T x, T1 y){
        a = x;
        b = y;
    }

    public void display(){
        System.out.println(a + "  " + b);
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Temp<Integer> ob = new Temp<Integer>();
        ob.setData(10,20);
        ob.display();
        Temp<Float> ob1 = new Temp<>();
        ob1.setData(10.3f,90.99f);
        ob1.display();
        Temp<String> ob2 = new Temp<>();
        ob2.setData("King", "Queen");
        ob2.display();

        Temp1<Integer,String> obj1 = new Temp1<>();
        obj1.setData(10,"King");
        obj1.display();

    }
}
