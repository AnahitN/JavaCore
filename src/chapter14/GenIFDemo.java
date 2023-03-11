package chapter14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("max in inums: " + iob.max());
        System.out.println("min in inums: " + iob.min());
        System.out.println("max in chs: " + cob.max());
        System.out.println("min in chs: " + cob.min());
    }
}
