package test;

public class max {


    public static void main(String[] args) {
        int[] array = {12, 34, 56, 76, 11, 22};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            max = array[0];
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println(max);
    }

}
