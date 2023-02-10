package homework.employee;

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
        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
            array = tmp;

        }

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }

    public void searchByID(String IDNumber) {

        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.getEmployeeID().contains(IDNumber)) {
                System.out.println(emp);
            }
        }
    }

    public void searchByCompName(String companyName) {
        for (int i = 0; i < size; i++) {
            Employee emp = array[i];
            if (emp.getCompany().contains(companyName)) {
                System.out.println(emp);
            }
        }
    }
}


