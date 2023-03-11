package chapter14.superGen;

public class Gen <T>{

    T ob;
    Gen(T o) {

        ob = o;
    }
    T getOb() {

        return ob;
    }
}
