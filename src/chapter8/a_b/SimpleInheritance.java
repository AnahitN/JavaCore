package chapter8.a_b;

import chapter8.a_b.A;
import chapter8.a_b.B;

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("sum of i, j, k in subOb: ");
        subOb.sum();
    }

}
