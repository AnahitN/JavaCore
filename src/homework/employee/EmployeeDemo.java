package homework.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage empStrg = new EmployeeStorage();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static Date dateOfBirthday = new Date();
    static Date registerDate = new Date();


    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        empStrg.add(new Employee("Poxos", "Poxosyan", "a001", 100, "company", "jr. manager", sdf.parse("12/12/2012"), registerDate));
        empStrg.add(new Employee("Petros", "Poxosyan", "a002", 200, "company", "manager", sdf.parse("23/12/1999"), registerDate));
        empStrg.add(new Employee("Martiros", "Poxosyan", "a003", 300, "company", "sr. manager", sdf.parse("11/11/1991"), registerDate));
        while (isRun) {
            printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    empStrg.print();
                    break;
                case "3":
                    searchEmployeeByID();
                    break;
                case "4":
                    System.out.println("Please input employee's company name");
                    String companyName = scanner.nextLine();
                    empStrg.searchByCompName(companyName);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changePositionByEmployeeId();
                    break;
                case "7":
                    empStrg.printByStatus(true);
                    break;
                case "8":
                    inactivateEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.out.println("WRONG COMMAND!!! Please try again!");

            }
        }

    }

    private static void activateEmployee() {
        empStrg.printByStatus(false);
        System.out.println("Please choose id to change employee's status");
        String employeeId = scanner.nextLine();
        Employee employee = empStrg.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("wrong id or employee is active, try again!");
        } else {
            employee.setActive(true);
            System.out.println("status changed");
        }
    }


    private static void inactivateEmployee() {
        empStrg.printByStatus(true);
        System.out.println("Please choose id to change employee's status");
        String employeeId = scanner.nextLine();
        Employee employee = empStrg.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("wrong id or employee is inactive, try again!");
        } else {
            employee.setActive(false);
            System.out.println("status changed");
        }
    }

    private static void changePositionByEmployeeId() {
        empStrg.printByStatus(true);
        System.out.println("Please choose id to change employee's position");
        String employeeId = scanner.nextLine();
        Employee employee = empStrg.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("wrong id, try again!");
        } else {
            System.out.println("Please input new position for employee");
            String newPosition = scanner.nextLine();
            employee.setPosition(newPosition);
            System.out.println("position changed!");
        }
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print all employees");
        System.out.println("Please input 3 for search employee by employee ID");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change employee position by id");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactivate employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input min  and max of salary");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minSalary = Double.parseDouble(salaryRange[0]);
        double maxSalary = Double.parseDouble(salaryRange[1]);
        if (maxSalary < minSalary) {
            System.out.println("minSalary should be less than maxSalary");
            return;
        }
        empStrg.searchBySalaryRange(minSalary, maxSalary);
    }


    private static void searchEmployeeByID() {
        System.out.println("Please input employee's ID!");
        String id = scanner.nextLine();
        Employee employee = empStrg.getEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee with " + id + " ID number does not exist!");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        System.out.println("Please input employee's name, surname, ID, salary, company name, position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = empStrg.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5], sdf.parse(employeeData[6]), sdf.parse(employeeData[7]));
            empStrg.add(employee);
            System.out.println("Employee was  added!");
        } else {
            System.out.println("Employee with " + employeeId + " ID already exists! ");
        }


    }
}
