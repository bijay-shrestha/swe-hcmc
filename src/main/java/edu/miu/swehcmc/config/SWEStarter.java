package edu.miu.swehcmc.config;

import edu.miu.swehcmc.model.Patient;
import edu.miu.swehcmc.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
@Configuration
public class SWEStarter {
    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {

            Patient ryan = new Patient(
                    "P1000001",
                    "Yes",
                    "Ryan Giggs",
                    "xyz@miu.edu",
                    "(641) 001-0012",
                    LocalDate.of(2000, Month.JANUARY,5));


            Patient paul = new Patient(
                    "P1000002",
                    "Yes",
                    "Paul Scholes",
                    "paul@miu.edu",
                    "(641) 002-0034",
                    LocalDate.of(1990, Month.APRIL,20));

            Patient ronaldo = new Patient(
                    "P1000003",
                    "No",
                    "Christiano Ronaldo",
                    "cronaldo@miu.edu",
                    "(641) 002-0036",
                    LocalDate.of(1990, Month.FEBRUARY,12));
            patientRepository.saveAll(List.of(ryan, paul, ronaldo));
        };
    }
}
