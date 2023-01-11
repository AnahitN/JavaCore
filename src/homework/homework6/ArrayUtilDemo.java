package homework.homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        ArrayUtil au = new ArrayUtil();
        au.maxOfArray(array);
        au.minOfArray(array);
        au.evenNumbers(array);
        au.oddNumbers(array);
        au.average(array);
        au.sum(array);
        au.firstNumber(array);
        au.lastNumber(array);
        au.midOfArray(array);
    }
}
