package day12;

import static java.lang.Thread.sleep;

public class TicToc {

    synchronized public void f1() {
        try {
           notify();
            System.out.print("Tic-");
            wait();
        } catch (Exception e) {
        }
    }

    synchronized public void f2() {
        try {
            notify();
            System.out.println("Toc");
            wait();
        } catch (Exception e) {
        }
    }

    synchronized public void f3() {
        try {
            System.out.println("Ok in f3 ");

        } catch (Exception e) {

        }
    }
}

class Player1 extends Thread {

    TicToc ob1;

    public Player1(TicToc ob1) {
        this.ob1 = ob1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ob1.f1();
        }
        ob1.f3();
    }
}

class Player2 extends Thread {
    TicToc ob2;

    public Player2(TicToc ob2) {
        this.ob2 = ob2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            ob2.f2();
        }
    }
}