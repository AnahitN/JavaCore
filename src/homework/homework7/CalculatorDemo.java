package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        double resultplus;
        Calculator calc = new Calculator();
        resultplus = calc.plus(5.9, 9.1);
        System.out.println("Գումարման արդյունքները՝ ");
        System.out.println(resultplus);
        resultplus = calc.plus(8.3, 5.44);
        System.out.println(resultplus);

        double resultminus;
        resultminus = calc.minus(7.4, 9);
        System.out.println("Հանման արդյունքները՝ ");
        System.out.println(resultminus);
        resultminus = calc.minus(20.6, 20);
        System.out.println(resultminus);

        int resultdivide;
        resultdivide = calc.divide(100, -4);
        System.out.println("Բաժանման արդյունքները՝ ");
        System.out.println(resultdivide);
        resultdivide = calc.divide(7620, 30);
        System.out.println(resultdivide);

        double resultmultiply;
        resultmultiply = calc.multiply(7.5, 5);
        System.out.println("Բազմապատկման արդյունքները՝ ");
        System.out.println(resultmultiply);
        resultmultiply = calc.multiply(0.5, 200);
        System.out.println(resultmultiply);


    }
}
