package chapter10;

public class FinallyDemo {

    static  void procA() {
        try {
            System.out.println("in procA()");
            throw new RuntimeException("demo");
        }
        finally {
            System.out.println("finally in procA()");
        }
    }
    static void procB() {
        try {
            System.out.println("in procB()");
            return;
        }
        finally {
            System.out.println("finally in procB()");
        }
    }
    static void procC(){
        try {
            System.out.println("in procC()");
        }
        finally {
            System.out.println("finally in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }
        catch (Exception e) {
            System.out.println("exc  caught");
        }
        procB();
        procC();
    }
}
