package homework.collection;

import java.util.*;

public class CollectionExample2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for \"names by HashSet\"");
            System.out.println("please input 2 for \"names by TreeSet\"");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    namesByHashSet();
                    break;
                case "2":
                    namesByTreeSet();
                    break;
                default:
                    System.out.println("wrong command, try again");
            }
        }



    }

    private static void namesByTreeSet() {
        System.out.println("please input 10 names by \",\"");
        String namesStr = scanner.nextLine();
        String[] names = namesStr.split(",");
        Set<String> allNames = new TreeSet<>();
        Collections.addAll(allNames, names);
        for (String name : allNames) {
            System.out.println(name);
        }
    }

    private static void namesByHashSet() {
        System.out.println("please input 5 names by \",\"");
        String namesStr = scanner.nextLine();
        String[] names = namesStr.split(",");
        Set<String> allNames = new HashSet<>();
        Collections.addAll(allNames, names);
        for (String name : allNames) {
            System.out.println(name);

        }
    }
}


