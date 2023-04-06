package chapter11.ex3;

public class MultiThreadDemo {

    public static void main(String[] args) {
        new NewThread3("one");
        new NewThread3("two");
        new NewThread3("three");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread ended");




    }

}
