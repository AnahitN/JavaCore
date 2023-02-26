package homework.medicalCenter.model;

import homework.medicalCenter.Profession;

import java.util.Objects;

public class Doctor extends Person{
    private String email;
    private Profession profession;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.profession = Profession.valueOf(profession);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = Profession.valueOf(profession);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(profession, doctor.profession);
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                "} " + super.toString();
    }
}

