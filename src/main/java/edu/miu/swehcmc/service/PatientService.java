package edu.miu.swehcmc.service;

import edu.miu.swehcmc.model.Patient;

import java.util.List;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
public interface PatientService {

    List<Patient> getPatients();
}
