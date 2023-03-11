package chapter14.rawType;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iob = new Gen<>(88);
        Gen<String> strOb = new Gen<>("Generics test");
        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getob();
        System.out.println("value: " + d);

    }
}
