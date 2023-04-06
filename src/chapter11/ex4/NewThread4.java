package chapter11.ex4;

public class NewThread4 implements Runnable{

    String name;
    Thread t;
    NewThread4(String threadName) {
         name = threadName;
         t = new Thread(this,name);
        System.out.println("new thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name +" interrupted");
        }
        System.out.println(name + "  ended");
    }
}
