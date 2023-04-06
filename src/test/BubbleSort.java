package test;

public class BubbleSort {

    public static void main(String[] args) {
        int [] array = {18,34,98,37,76,30,12,-1};
        for(int i = 0; i < array.length; i ++){
            for(int j = 1;j < array.length-i; j++){
                if(array[j] > array[j-1]) {
                    int x = array[j];
                    array[j] = array[j-1];
                   array[j-1]= x;
                }
            }
        }
        for(int i = 0; i<array.length; i++){
        System.out.println(array[i]);
    }}

}
