package homework.employee.storage;

import homework.employee.model.Company;
import homework.employee.model.Employee;

public class CompanyStorage {

    private Company[] array = new Company[10];

    private int size = 0;

    public void add(Company value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    private void extend() {
        Company[] tmp = new Company[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, size);

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }

    public Company getCompanyById(String id) {

        for (int i = 0; i < size; i++) {

            if (array[i].getId().equals(id)) {
                return array[i];
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }
}


