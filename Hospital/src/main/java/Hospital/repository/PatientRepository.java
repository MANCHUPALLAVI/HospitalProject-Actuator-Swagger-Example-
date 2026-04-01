package Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Hospital.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
