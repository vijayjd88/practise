package day12;

public class ThreadClass extends  Thread{
    int n;
    String name;
    public ThreadClass() {
        this.n = 10;
        this.name = "JP Morgan";
    }
    public ThreadClass(int n, String name) {
        this.n = n;
        this.name = name;
    }

    @Override
    public void run() {

        for(int i = 0;i<n;i++){
            System.out.println(name +"    " + i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
