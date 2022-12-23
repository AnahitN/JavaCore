package homework.homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            int j;
            for (j = 8; j > i; j--) {
                System.out.print("  ");

            }
            for (j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("figure2");
        for (int i = 0; i < 4; i++) {
            int j;
            for (j = 3; j > i; j--) {
                System.out.print(" ");

            }
            for (j = 0; j <= i; j++)
                System.out.print("* ");


            System.out.println();
        }

        for (int i = 3; i > 0; i--) {
            int j;
            for (j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
            for (j = 3; j >= i; j--)
                System.out.print(" ");
        }
    }
}

