package Hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hospital.entity.Doctor;
import Hospital.repository.DoctorRepository;

@Service
public class DoctorService 
{
	 @Autowired
	 private DoctorRepository repo;

	  public Doctor addDoctor(Doctor doctor)
	  {
	     return repo.save(doctor);
	  }
	  public List<Doctor> getAllDoctors()
	  {
	      return repo.findAll();
	  }
}
