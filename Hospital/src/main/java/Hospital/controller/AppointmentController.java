package Hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Hospital.entity.Appointment;
import Hospital.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @PostMapping("/book")
    public Appointment book(@RequestParam Long doctorId,@RequestParam Long patientId) {
        return service.bookAppointment(doctorId, patientId); 
        //localhost:8080/appointments/book?doctorId=6&patientId=6
    }

    @GetMapping
    public List<Appointment> getAppointments() {
        return service.getAllAppointments();
    }
}
//localhost:8080/actuator

//localhost:8080/swagger-ui/index.html