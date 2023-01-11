package homework.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int indexCount = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                continue;
            } else if (spaceArray[i] != ' ') {
                indexCount++;

            }
            break;

        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                continue;
            } else if (spaceArray[i] != ' ') {
            }
            break;
        }

        char[] result = new char[spaceArray[spaceArray.length-1]-spaceArray[0]+1];
        for (int i = 0; i < result.length; i++) {
            result[i] = spaceArray[i];
            System.out.print(result[i]);
        }


    }
}
