package chapter11.ex1;

public class NewThread implements  Runnable {

    Thread t ;
    NewThread() {
        t = new Thread(this, "demo thread");
        System.out.println("child thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread ended");
    }
}
