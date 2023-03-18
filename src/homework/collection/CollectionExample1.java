package homework.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        boolean isRun = true;

        names.add("Anahit");
        names.add("Adolf");
        names.add("Byuzand");
        names.add("Zigmund");
        names.add("Avtandil");
        while (isRun) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for check name");
            System.out.println("please input 2 for delete name");
            System.out.println("please input 3 for add name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    doesContainName();
                    break;
                case "2":
                    deleteName();
                    break;
                case "3":
                    addName();
                    break;
                default:
                    System.out.println("wrong command, try again");
            }
        }
    }

    private static boolean doesContainName() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
       if (names.contains(name)) {
                System.out.println("name \"" + name + "\" exists");
           return true;
            }
           else {
                System.out.println("there is no name \"" + name + "\" in the list");
           return false;
            }

        }



    public static void deleteName() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        names.removeIf(s -> s.equals(name));
        System.out.println("Name was deleted");
        for (String s : names) {
            System.out.println(s);
        }
    }

    public static void addName() {
        try {
            System.out.println("please input name");
            String name = scanner.nextLine();
            System.out.println("please input index");
            String indexStr = scanner.nextLine();
            int index = Integer.parseInt(indexStr);

            names.add(index, name);
            System.out.println("name was added");
            for (String s : names) {
                System.out.println(s);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("wrong index, try again");
        }

    }


}
