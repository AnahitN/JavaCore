package chapter6;

public class TestStack {

    public static void main(String[] args) {
        Stack myst1 = new Stack();
        Stack myst2 = new Stack();
        for (int i = 0; i < 10; i++) {
            myst1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myst2.push(i);
        }
        System.out.println("myst1");
        for (int i = 0; i < 10; i++) {
            System.out.println(myst1.pop());
        }
        System.out.println("myst2");
        for (int i = 0; i < 10; i++) {
            System.out.println(myst2.pop());
        }
    }
}
