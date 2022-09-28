package entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PatientRecord extends BaseEntity{
    /*@ManyToOne
    @JoinColumn( name="patient_id", nullable=false)
    private Patient patient;*/

    private LocalDateTime recordDate;

    public PatientRecord(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }

    public PatientRecord() {
    }

    /*public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }*/

    public LocalDateTime getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDateTime recordDate) {
        this.recordDate = recordDate;
    }
}
