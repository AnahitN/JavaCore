package homework.homework8;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(0);
        dy.add(1);
        dy.add(90);
        dy.add(3);
        dy.add(4);
        dy.add(5);
        dy.add(6);
        dy.add(7);

        dy.deleteByIndex(4);
        dy.print();
        dy.set(7, 70);
        dy.print();

        System.out.println(dy.exists(6));
        System.out.println(dy.getIndexByValue(90));
    }

}
