package homework.homework1;

public class IfForExample {

    public static void main(String[] args) {
        int a;
        int b;
        a = 30;
        b = 45;
        if (a > b) {
            System.out.println("max: " + a);
        }
        if (b > a) {
            System.out.println("max: " + b);
        }

        for (a = 30; a <= b; a++) {
            System.out.println(a);
        }

        System.out.println((char) a);
        System.out.println((char) b);

        if (a == b) {
            System.out.println(" a = b ");
        } else {
            System.out.println("a ≠ b");
        }

    }
}

