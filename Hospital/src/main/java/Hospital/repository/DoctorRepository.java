package Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Hospital.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>
{

}
