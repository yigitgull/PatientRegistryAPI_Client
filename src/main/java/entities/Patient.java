package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Patient extends BaseEntity{
    private String identityNo;
    private String name;

    private String email;
    private String surname;
    private String phoneNumber;

    private LocalDate birthDate;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<PatientRecord> patientRecords;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "document_id", referencedColumnName = "id")
    private Document document;
    public Patient() {
    }

    public Patient(String identityNo, String name, String email, String surname, String phoneNumber, LocalDate birthDate, List<PatientRecord> patientRecords, Document document) {
        this.identityNo = identityNo;
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.patientRecords = patientRecords;
        this.document = document;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PatientRecord> getPatientRecords() {
        return patientRecords;
    }

    public void setPatientRecords(PatientRecord patientRecords) {
        this.patientRecords = new ArrayList<PatientRecord>();
        this.patientRecords.add(patientRecords);

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birth_date) {
        this.birthDate = birth_date;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "identityNo='" + identityNo + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthDate=" + birthDate +
                ", patientRecords=" + patientRecords +
                ", document=" + document +
                '}';
    }
}

