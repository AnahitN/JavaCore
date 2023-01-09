package homework.homework5;

public class ArraySpaceExample {

    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int indexCount = -1;
        char symbol = ' ';
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ')
            { continue;}
            else if (spaceArray[i] != ' ') {
                indexCount ++;
                symbol = spaceArray[i-1];


            }

        }
        char[] result = new char[indexCount];
        for (int j = 0; j <= result.length; j++) {
            result[j] = symbol;
            System.out.print(result[j]);
        }


//        for (int i = spaceArray.length - 1; i > 0; i--) {
//            if (spaceArray[i] == ' ') {
//                continue;
//            }
//            else if (spaceArray[i] != ' ') {
//                break;
//            }
//        }




    }
}
