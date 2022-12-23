package homework.homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
        int x;
        x = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > x) {
                x = array[i];

            }

        }
        System.out.println("մասիվի ամենամեծ թիվը " + x + " է։");


        for (int i = 0; i < array.length; i++) {
            if (array[i] < x) {
                x = array[i];
            }

        }
        System.out.println("մասիվի ամենափոքր թիվը " + x + " է։");
    }
}

