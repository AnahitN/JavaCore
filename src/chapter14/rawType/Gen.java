package chapter14.rawType;

public class Gen <T> {
    T ob;
    Gen(T o) {
        ob = o;
    }
    T getob() {
        return ob;
    }

}
