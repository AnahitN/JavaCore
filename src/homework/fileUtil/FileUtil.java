package homework.fileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        fileSearch();
        contentSearch();
        printSizeOfPackage();
        createFileWithContent();
        findLines();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch() throws IOException {
        System.out.println("please input folder path & file name by \",\"");
        String fileData = scanner.nextLine();
        String[] fileDataStr = fileData.split(",");
        String path = fileDataStr[0];
        String fileName = fileDataStr[1];
        File directory = new File(path);
        if (directory.isDirectory()) {
            String[] list = directory.list();
            for (String s : list) {
                if (s.equals(fileName)) {
                    System.out.println(s);
                    return true;
                }
            }
        }

        return false;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input folder path & keyword by \",\"");
        String fileData = scanner.nextLine();
        String[] fileDataStr = fileData.split(",");
        String path = fileDataStr[0];
        String keyword = fileDataStr[1];
        File directory = new File(path);

        String[] list = directory.list();
        for (String s : list) {
            if (s.contains(".txt")) {
                try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {
                    String line = "";
                    while ((line = inputStream.readLine()) != null) {
                        if (line.contains(keyword)) {
                            System.out.println("file is " + s);

                        }
                    }
                } catch (IOException e) {

                }


            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please input path, keyword by \",\"");
        String data = scanner.nextLine();
        String[] dataStr = data.split(",");
        String txtPath = dataStr[0];
        String keyword = dataStr[1];
        try (BufferedReader bf = new BufferedReader(new FileReader(txtPath))){
            String line = "";
            while ((line = bf.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input path of the folder");
        String path = scanner.nextLine();
        File directory = new File(path);
        String[] list = directory.list();
        int sum = 0;
        for (String s : list) {
            sum += directory.length();
        }
        System.out.println("size of package is: " + sum + "bytes");
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input path, fileName, content by \",\"");
        String data = scanner.nextLine();
        String[] dataStr = data.split(",");
        String path = dataStr[0];
        String fileName = dataStr[1];
        String content = dataStr[2];
        File file = new File(path,fileName);
        if (!file.exists()) {
         boolean isCreated = file.createNewFile();
            System.out.println(isCreated + "file is created");
            String filePath = file.getAbsolutePath();
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {
                bf.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
