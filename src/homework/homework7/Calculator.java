package homework.homework7;

public class Calculator {
    double plus(double a, double b) {
        return a + b;
    }

    double minus(double i, int j) {
        return i - j;
    }

    int divide(int x, int y) {

        if (y == 0) {

            System.out.print("Թիվը 0-ի չի բաժանվում  ");
            return  -1;
        }
        return x / y;
    }
    double multiply(double m, int n) {
        return m * n;
    }
}
