package test;

public class bubblesort2 {

    public static void main(String[] args) {
        int[] arr = {12, 345, 65, 654, 987, -98, -765, 45};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length - i; j++) {
//                if (arr[j] > arr[j - 1]) {
//                    int x = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = x;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j-1]){
                    int x = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = x;
                }
            }
        }
        for(int i = 0; i< arr.length; i++){
           System.out.println(arr[i]);
        }

    }

}
