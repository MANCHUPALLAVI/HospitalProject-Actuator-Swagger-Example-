package Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Hospital.entity.Appointment;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>
{

}
