package homework.homework6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("մասիվի ամենամեծ թիվը " + max + " է։");
    }


    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("մասիվի ամենափոքր թիվը " + min + " է։");
    }

    void evenNumbers(int[] array) {
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
    }

    void oddNumbers(int[] array) {
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
    }

    void average(int[] array) {
        int result = 0;
        for (int j = 0; j < array.length; j++) {
            result = result + array[j];

        }
        System.out.println("Միջին թվաբանականը հավասար է " + result / array.length + "-ի");
    }

    void sum(int[] array) {
        int result = 0;
        for (int j = 0; j < array.length; j++) {
            result = result + array[j];

        }
        System.out.println("Մասիվի էլեմենտների գումարը հավասար է " + result + "-ի");
    }

    void firstNumber(int[] array) {
        System.out.println("մասիվի առաջին էլեմենտը " + array[0] + "ն է։");
    }

    void lastNumber(int[] array) {
        System.out.println("մասիվի վերջին էլեմենտը " + array[array.length - 1] + "ն է։");
    }

    void midOfArray(int[] array) {
        System.out.println("մասիվի մեջտեղի էլեմենտը " + array[array.length / 2] + "ն է։");
    }
}
