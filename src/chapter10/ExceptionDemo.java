package chapter10;

public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("normal ending");
    }

    public static void main(String[] args) {
try {
    compute(1);
    compute(20);
}
catch (MyException e) {
    System.out.println(" exception is " + e);
}
    }
}
