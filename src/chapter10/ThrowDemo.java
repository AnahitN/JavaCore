package chapter10;

public class ThrowDemo {


    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("exc in demoproc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("2nd catch " + e);
        }
    }

}
