package day4;

public class Demo4 {
    public static void main(String[] args) {

        Employee a[]=new Employee[4];
        a[0]=new Employee("Vijay","34245");
        a[1]=new Employee("Jenifer","334567");
        a[2]=new Employee("Benjamin","6543212");
        a[3]=new Employee("Rajamani", "999999");

       // for(int i=0;i<a.length;i++){
           // for(int j=0; j<a[i].length();j++)
         //   System.out.print(a[i] + " ");
        //}

        for (Employee x :a){
            // x.display();
            if(x.fname.equals("Jenifer")){
                System.out.println(x.fname);
                System.out.println(x.salary);
            }

        }

        System.out.println(a[1].fname+" " + a[1].salary );

    }
}
