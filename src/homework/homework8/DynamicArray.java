package homework.homework8;

public class DynamicArray {

    private int[] array = new int[10];

    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;


    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
            array = tmp;

        }


    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println("Wrong index!");
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 && index > array.length) {
            System.out.println("Նման էլեմենթ չկա!");
        }


        for (int i = index + 1; i < size; i++) {

            array[i - 1] = array[i];

        }
        size--;
    }


    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։
    public void set(int index, int value) {


        if (index < 0 && index > array.length) {
            System.out.println("Նման էլեմենթ չկա!");

        }

        array[index] = value;
    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
//Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {

        array[index] = value;

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i++];
        }
        if (index < 0 && index > array.length) {
            System.out.println("Նման էլեմենթ չկա!");

        }


    }


    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false
    public boolean exists(int value) {
        for (int i = 0; i < array.length; i++) {


            if (value == array[i]) {


                return true;
            }
        }
        return false;
    }


    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
//եթե չկա, -1
    public int getIndexByValue(int value) {

        int first;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (i != j && array[i] == array[j]) {

                    if (i < j) {
                        first = i;
                    }
                    first = j;
                    return first;
                }
            }

        }
        if (value < 0 && value > size) {

            return -1;
        }


    }


}


