package homework.medicalCenter.storage;

import homework.employee.model.Employee;
import homework.medicalCenter.Profession;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DateUtil;

import javax.print.Doc;
import java.util.Date;

public class PersonStorage {
    Doctor doctor = new Doctor();
    private Person[] persons = new Person[10];
    private int size = 0;

    public void add(Person person) {

        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor)
                System.out.println(persons[i]);
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient)
                System.out.println(persons[i]);

        }
    }

    public void deleteDoctorById(String id) {

        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor
                    && person.getId().equals(id)) {
                deletePersonByIndex(i);
            }
        }
    }


    public int getSize() {
        return size;
    }


    public void searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor
                    && person.getId().equals(id)) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void searchPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodayPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }
    public boolean isDoctorAvailable(Date registerDateTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor)
                        && patient.getRegisterDateTime().equals(registerDateTime)) {
                    return false;
                }
            }
        }
        return true;
    }
    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }

    private void deletePersonByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }


}
