package chapter11.ex4;

public class DemoJoin {

    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("one");
        NewThread4 ob2 = new NewThread4("two");
        NewThread4 ob3 = new NewThread4("three");
        System.out.println("thread one started: " + ob1.t.isAlive());
        System.out.println("thread two started: " + ob2.t.isAlive());
        System.out.println("thread three started: " + ob3.t.isAlive());

        try {
            System.out.println("waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
         }catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }

        System.out.println("thread one is alive: " + ob1.t.isAlive());
        System.out.println("thread two is alive: " + ob2.t.isAlive());
        System.out.println("thread three is alive: " + ob3.t.isAlive());
        System.out.println("main thread ended");
    }

}
