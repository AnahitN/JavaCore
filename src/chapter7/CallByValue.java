package chapter7;

public class CallByValue {

    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;

        System.out.println("a & b before call: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a & b after call: " + a + " " + b);
    }
}
