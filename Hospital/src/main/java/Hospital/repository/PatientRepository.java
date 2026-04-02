package Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Hospital.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
