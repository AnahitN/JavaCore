package test;

public class delete2 {
    public static void main (String[] args) {
        int [] array = {1,2,3,4,5};
        int size = array.length;
        for (int j = array[3];j<size;j++){
            array[j-1] = array[j];
        }
        size--;
        for(int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
