package test;

public class Delete {
    static int[] array = {1, 2, 34, 5, 6, 7};
    static int size = array.length;

    public static void main(String[] args) {
        delete(1);
        for (int i = 0; i < size; i++) {

            System.out.println(array[i]);
        }
    }

    public static void delete(int index) {
        try {

            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wrong index");
        }

    }
}
