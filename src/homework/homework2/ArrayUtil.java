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

        System.out.println("մասիվի զույգ  թվերն են՝");
        int i;
        int even = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("զույգ թվերի քանակը " + even + " է։");

        System.out.println("մասիվի կենտ թվերն են՝");
        int odd = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                System.out.print(array[j] + " ");
                odd++;
            }

        }
        System.out.println();
        System.out.println("կենտ թվերի քանակը " + odd + " է։");


        int result = 0;
        for (int j = 0; j < array.length; j++) {
            result = result + array[j];

        }
        System.out.println("Միջին թվաբանականը հավասար է " + result / 10 + "-ի");

        System.out.println("Մասիվի էլեմենտների գումարը հավասար է " + result + "-ի");
        System.out.println("մասիվի առաջին էլեմենտը " + array[0] + "ն է։");
        System.out.println("մասիվի վերջին էլեմենտը " + array[array.length - 1] + "ն է։");
        System.out.println("մասիվի մեջտեղի էլեմենտը " + array[array.length / 2] + "ն է։");
    }


}




