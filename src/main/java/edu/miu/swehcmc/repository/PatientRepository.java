package edu.miu.swehcmc.repository;

import edu.miu.swehcmc.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT p FROM Patient p ORDER BY p.fullNames")
    List<Patient> getAllPatients();
}
