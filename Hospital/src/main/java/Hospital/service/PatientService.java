package Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hospital.entity.Patient;
import Hospital.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repo;

    public Patient addPatient(Patient patient)
    {
        return repo.save(patient);
    }

    public List<Patient> getAllPatients()
    {
        return repo.findAll();
    }
}