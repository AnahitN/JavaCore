package chapter7;

public class VarArgs {

    static void vaTest (int ... v) {
        System.out.println("vaTest (int ...): " + "кол-во аргументов: " + v.length+ "содержимое: ");
        for (int x: v){
            System.out.println(x + " ");
            System.out.println();;
        }
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ...) " +"кол-во аргументов: " + v.length+ "содержимое: ");
        for (boolean x : v) {
            System.out.println(x + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
    }
}
