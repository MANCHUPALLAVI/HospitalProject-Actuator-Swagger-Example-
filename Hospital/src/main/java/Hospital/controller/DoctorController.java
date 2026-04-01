package Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hospital.entity.Doctor;
import Hospital.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return service.addDoctor(doctor);
        //localhost:8080/doctors
    }

    @GetMapping
    public List<Doctor> getDoctors() {
        return service.getAllDoctors();
    }
}