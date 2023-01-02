package homework.homework4;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int x;
        for (int i = 0; i < chars.length; i++) {
            x = 0;
            if (chars[i] == c) {
                x++;
                System.out.println("1. փոփոխականի քանակը " + x + " է:");
            }

        }


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("2. մասիվի մեջտեղի երկու սիմվոլներն են՝ " + chars[chars2.length / 2 - 1] + ", ");
        System.out.println(chars[chars2.length / 2] + ":");


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.print("3.");
        boolean a = true;
        boolean b = false;
        if (chars3[chars3.length - 2] == 'l') {
            if (chars3[chars3.length - 1] == 'y')
                System.out.println(a);


        } else {
            System.out.println(b);

        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        System.out.print("4. ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }

        }
    }
}
