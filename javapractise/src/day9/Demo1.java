package day9;

public class Demo1 {
    public static void main(String[] args) {
        Calculator ob = (a,b)->(a+b);

        System.out.println(ob.cal(10,30));
        ob= (a,b)->{int c = a*b;
                     return c;};
        System.out.println(ob.cal(10,20));

        disp ob1 = ()->{
            System.out.println("success");
        };
        disp ob2 = ()->{
            System.out.println("failure");
        };

        ob1.displyMesg();
        ob2.displyMesg();
        f1((x,y)->(x+y),90,98);
        f1((x,y)->(x-y),90,98);

    }

    public static void f1(Calculator x, int y , int z){
        System.out.println(x.cal(y,z));
    }
}
