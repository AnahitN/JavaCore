package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage empStrg = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();
    static Date dateOfBirthday = new Date();
    Date registerDate = new Date();


    public static void main(String[] args) throws ParseException {

        boolean isRun = true;
        Company company = new Company("company001","company example", "Gyumri", "1234567" );
        company.setEmployeeCount(3);
        companyStorage.add(company);
        empStrg.add(new Employee("Anahit", "Tadevosyan", "a001", 500, company, "jr. manager", new Date(), DateUtil.stringToDate("02/12/1997")));
        empStrg.add(new Employee("Petros", "Poxosyan", "a002", 200, company, "manager", new Date(), DateUtil.stringToDate("09/04/1999")));
        empStrg.add(new Employee("Martiros", "Poxosyan", "a003", 300, company, "sr. manager", new Date(), DateUtil.stringToDate("09/06/2000")));
        while (isRun) {
            Commands.printCommands();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    empStrg.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeByID();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    companyStorage.print();
                    System.out.println("Please input employee's company id");
                    String companyId = scanner.nextLine();
                   Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {empStrg.searchEmployeeByCompany(companyById);
                        empStrg.searchEmployeeByCompany(companyById);
                    } else {
                        System.out.println("Company does not exist");
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changePositionByEmployeeId();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    empStrg.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    inactivateEmployee();
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("WRONG COMMAND!!! Please try again!");

            }
        }

    }

    private static void addCompany() {
        System.out.println("Please input id, name, address, phone number");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        } else {
            System.out.println("Company with " + companyId + " already exists!");
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
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id!");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("Please input employee's name, surname, ID, salary, position,date of birthday(dd/MM/yyyy)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Employee employeeById = empStrg.getEmployeeById(employeeId);
            if (employeeById == null) {
                Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]), companyById, employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                empStrg.add(employee);
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                System.out.println("Employee was  added!");
            } else {
                System.out.println("Employee with " + employeeId + " ID already exists! ");
            }

        } else {
            System.out.println("Wrong company id! Please try again!");
        }
    }
}
