package chapter8.a_b;

import chapter8.a_b.A;

public class B extends A {

    int k;
    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
