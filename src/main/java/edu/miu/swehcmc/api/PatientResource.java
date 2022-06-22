package edu.miu.swehcmc.api;

import edu.miu.swehcmc.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static edu.miu.swehcmc.constant.ResourceKeyConstant.BASE_API;
import static edu.miu.swehcmc.constant.ResourceKeyConstant.PatientResourceConstant.PATIENT_BASE;

/**
 * @author bijayshrestha on 6/22/22
 * @project swe-hcmc
 */
@RestController
@RequestMapping(BASE_API + PATIENT_BASE)
public class PatientResource {
    private final PatientService patientService;
    @Autowired
    public PatientResource(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public ResponseEntity<?> getPatients(){
        return new ResponseEntity<>(patientService.getPatients(), HttpStatus.OK);
    }
}
