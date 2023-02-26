package homework.employee.storage;

import homework.employee.model.Company;
import homework.employee.model.Employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];

    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }

    public void printByStatus(boolean isActive) {
        for (int i = 0; i < size; i++) {
            if (array[i].isActive() == isActive)
                System.out.println(array[i]);

        }
    }

    public Employee getEmployeeById(String id) {

        for (int i = 0; i < size; i++) {

            if (array[i].getEmployeeID().equals(id)) {
                return array[i];
            }
        }
        return null;
    }


    public void searchEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().equals(company)) {
                System.out.println(employee);
                ;
            }
        }

    }

    public void searchBySalaryRange(double minSalary, double maxSalary) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
                System.out.println(employee);
            }

        }

    }


}


