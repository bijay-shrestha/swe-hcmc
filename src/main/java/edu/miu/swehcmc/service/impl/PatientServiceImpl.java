package edu.miu.swehcmc.service.impl;

import edu.miu.swehcmc.model.Patient;
import edu.miu.swehcmc.repository.PatientRepository;
import edu.miu.swehcmc.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static edu.miu.swehcmc.constant.ErrorMessageConstant.PatientResource.PATIENT_NOT_FOUND;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getPatients() {
        List<Patient> patients = patientRepository.findAll();
        if(patients.isEmpty()){
            throw new IllegalStateException(PATIENT_NOT_FOUND);
        }
        return patients;
    }
}
