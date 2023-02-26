package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodayPatients();
                    break;
                default:
                    System.out.println("WRONG COMMAND!!! Please try again!");

            }

        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            personStorage.searchPatientsByDoctor(doctor);
        } else {
            System.out.println("doctor with " + id + " does not exist");
        }

    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            try {
                System.out.println("Please input patient's id(id card), name, surname, phone number, registerDateTime(dd-MM-yyyy HH:mm)");
                String patientDataStr = scanner.nextLine();
                String[] patientData = patientDataStr.split(",");
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(registerDateTime, doctor)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctor);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered!");
                } else {
                    System.out.println("Doctor is unavailable in that  date time!");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect registerDate Time! Please try again.");
            }

        }

    }

    private static void changeDoctorData() {
        personStorage.printDoctors();
        System.out.println("Please input id");
        String id = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(id);
        try {
            if (doctorById != null) {
                System.out.println("Please input doctor's name, surname, email, phone number, profession");
                String doctorDataStr = scanner.nextLine();
                String[] doctorData = doctorDataStr.split(",");

                String profession = String.valueOf(Profession.valueOf(doctorData[4]));
                doctorById.setName(doctorData[0]);
                doctorById.setSurname(doctorData[1]);
                doctorById.setEmail(doctorData[2]);
                doctorById.setPhoneNumber(doctorData[3]);
                doctorById.setProfession(doctorData[4]);
                System.out.println("Doctor was updated!");
            } else {
                System.out.println("Doctor with " + id + "does not exist!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(" Profession is wronq, try againq");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("please choose id");
        String doctorId = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(doctorId);
        if (doctor != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Wrong id!!! Please try again.");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please choose profession");
        try {


            Profession[] professions = Profession.values();
            for (Profession profession1 : professions) {
                System.out.println(profession1);
            }
            String profession = scanner.nextLine();
            personStorage.searchDoctorByProfession(Profession.valueOf(profession));
        } catch (IllegalArgumentException e) {
            System.out.println("profession is wrong, try again");
        }

    }

    private static void addDoctor() {
        System.out.println("Please input doctor's id, name, surname, email, phone number, profession. Please choose profession from the list:" + Arrays.toString(Profession.values()));
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        try {
            String profession = String.valueOf(Profession.valueOf(doctorData[5]));
            Doctor doctorById = personStorage.getDoctorById(doctorId);

            if (doctorById == null) {
                Doctor doctor = new Doctor();
                doctor.setId(doctorId);
                doctor.setName(doctorData[1]);
                doctor.setSurname(doctorData[2]);
                doctor.setEmail(doctorData[3]);
                doctor.setPhoneNumber(doctorData[4]);
                doctor.setProfession(profession);
                personStorage.add(doctor);
                System.out.println("Doctor was added!");
            } else {
                System.out.println("Doctor with " + doctorId + "already exits");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Profession is wrong! try again");
        }

    }
}
