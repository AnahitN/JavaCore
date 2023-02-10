package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmployeeStorage empStrg = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employees");
            System.out.println("Please input 3 for search employee by employee ID");
            System.out.println("Please input 4 for search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee's name!");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee's surname!");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee's ID!");
                    String ID = scanner.nextLine();
                    System.out.println("Please input employee's salary!");
                    String salary = scanner.nextLine();
                    System.out.println("Please input employee's company name!");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee's position!");
                    String position = scanner.nextLine();
                    Employee emp = new Employee(name, surname, ID, Double.parseDouble(salary), company, position);
                    empStrg.add(emp);
                    System.out.println("Employee is added!");

                    break;
                case "2":
                    empStrg.print();

                    break;
                case "3":
                    System.out.println("Please input employee's ID number!");
                    String IDNumber = scanner.nextLine();
                    empStrg.searchByID(IDNumber);
                    break;
                case "4":
                    System.out.println("Please input employee's company name!");
                    String companyName = scanner.nextLine();
                    empStrg.searchByCompName(companyName);
                    break;
                default:
                    System.out.println("WRONG COMMAND!!! Please try again!");

            }
        }
    }
}
