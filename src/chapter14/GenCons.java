package chapter14;

public class GenCons {
    private double val;

    <T extends Number> GenCons(T args) {
        val = args.doubleValue();
    }

    void showval() {
        System.out.println("val: " + val);
    }
}
