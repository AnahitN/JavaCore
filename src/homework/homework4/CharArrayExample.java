package homework.homework4;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int quantity = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                quantity++;

            }

        }
        System.out.println("1. փոփոխականի քանակը մասիվի մեջ " + quantity + " է:");


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("2. մասիվի մեջտեղի երկու սիմվոլներն են՝ " + chars[chars2.length / 2 - 1] + ", ");
        System.out.println(chars[chars2.length / 2] + ":");


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        System.out.print("3. ");
        System.out.println(chars3[chars3.length - 2] == 'l' && (chars3[chars3.length - 1] == 'y'));


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        System.out.print("4. ");
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }

        }
    }


}

