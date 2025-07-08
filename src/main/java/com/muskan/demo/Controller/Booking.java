package com.muskan.demo.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = {"http://localhost:5500", "http://127.0.0.1:5500"})
@RestController
public class Booking {

    @GetMapping("/booking")
    public String getAppointment() {
        return "This is the booking";
    }

    @PostMapping("/booking")
    public String scheduleAppointment(@RequestBody Map<String, String> appointment) {
        System.out.println("Received appointment:");
        System.out.println("Service: " + appointment.get("service"));
        System.out.println("Name: " + appointment.get("name"));
        System.out.println("Email: " + appointment.get("email"));
        System.out.println("Date: " + appointment.get("date"));
        System.out.println("Time: " + appointment.get("time"));
        System.out.println("Phone: " + appointment.get("phone"));

        return "Appointment received successfully!";
    }
}

