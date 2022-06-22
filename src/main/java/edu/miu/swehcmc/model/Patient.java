package edu.miu.swehcmc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
@Entity
@Data
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientId;
    @Column(nullable = false)
    private String patientNumber;
    @Column(nullable = false)
    private String isAnOutPatient;
    @Column(nullable = false)
    private String fullNames;
    @Column(nullable = true)
    private String emailAddress;
    @Column(nullable = false)
    private String contactPhoneNumber;
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    public Patient(String patientNumber,
                   String isAnOutPatient,
                   String fullNames,
                   String emailAddress,
                   String contactPhoneNumber,
                   LocalDate dateOfBirth) {
        this.patientNumber = patientNumber;
        this.isAnOutPatient = isAnOutPatient;
        this.fullNames = fullNames;
        this.emailAddress = emailAddress;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateOfBirth = dateOfBirth;
    }
}
