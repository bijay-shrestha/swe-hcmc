package edu.miu.swehcmc.repository;

import edu.miu.swehcmc.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
