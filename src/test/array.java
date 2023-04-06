package test;

public class array {
    public static void main (String[] args) {
        int[] array = {1,4,2,7,9,30,4};
        int max = array[0];
        for (int i = 0; i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);


    }

}
