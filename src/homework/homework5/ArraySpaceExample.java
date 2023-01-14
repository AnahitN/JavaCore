package homework.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                startIndex++;
            } else {

                break;
            }

        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] == ' ') {
                endIndex--;
            } else {

                break;
            }
        }

        char[] result = new char[endIndex - startIndex + 1];
        int j = 0;
        for (int i = startIndex; i <= endIndex; i++) {

            result[j++] = spaceArray[i];
        }
        for (char c : result) {
            System.out.print(c);
        }


    }
}
