package homework.employee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Employee {


    private String name;
    private String surname;
    private String employeeID;
    private double salary;
    private String company;
    private String position;
    private boolean active = true;
    private java.util.Date Date;
    private Date registerDate = new Date();
    private Date dateOfBirthday;


    public Employee() {
    }


    public Employee(String name, String surname, String employeeID, double salary, String company, String position, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeID = employeeID;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.dateOfBirthday = dateOfBirthday;

    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && active == employee.active && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(employeeID, employee.employeeID) && Objects.equals(company, employee.company) && Objects.equals(position, employee.position) && Objects.equals(registerDate, employee.registerDate) && Objects.equals(dateOfBirthday, employee.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, employeeID, salary, company, position, active, registerDate, dateOfBirthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", dateOfBirthday=" + dateOfBirthday +
                ",regiterDate=" + registerDate+
                '}';
    }

}
