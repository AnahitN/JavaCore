package homework.employee;

public interface Commands {
    String EXIT = "0";
    String ADD_EMPLOYEE = "1";
    String ADD_COMPANY = "2";
    String PRINT_EMPLOYEES = "3";
    String SEARCH_EMPLOYEE_BY_ID = "4";
    String SEARCH_EMPLOYEE_BY_COMPANY_ID = "5";
    String SEARCH_EMPLOYEE_BY_SALARY_RANGE = "6";
    String CHANGE_EMPLOYEE_POSITION = "7";
    String PRINT_ONLY_ACTIVE_EMPLOYEES = "8";
    String INACTIVATE_EMPLOYEE_BY_ID = "9";
    String ACTIVATE_EMPLOYEE_BY_ID = "10";
    String PRINT_ALL_COMPANIES = "11";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_EMPLOYEE + " for add employee");
        System.out.println("Please input " + ADD_COMPANY + " for add company");
        System.out.println("Please input " + PRINT_EMPLOYEES + " for print all employees");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_ID + " for search employee by employee ID");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_COMPANY_ID + " for search employee by company name");
        System.out.println("Please input " + SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by salary range");
        System.out.println("Please input " + CHANGE_EMPLOYEE_POSITION +  "for change employee position by id");
        System.out.println("Please input " + PRINT_ONLY_ACTIVE_EMPLOYEES + " for print only active employees");
        System.out.println("Please input " + INACTIVATE_EMPLOYEE_BY_ID + " for inactivate employee by id");
        System.out.println("Please input " + ACTIVATE_EMPLOYEE_BY_ID + " for activate employee by id");
        System.out.println("Please input " + PRINT_ALL_COMPANIES + " for print all companies");
    }
}
