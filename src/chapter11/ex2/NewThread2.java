package chapter11.ex2;

public class NewThread2 extends Thread {

    NewThread2() {
        super("demo thread");
        System.out.println("child thread: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("child thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread ended");
    }
}
