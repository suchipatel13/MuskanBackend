package com.muskan.demo.Controller;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Booking {

    @Id
    @SequenceGenerator(
            name = "booking_sequence",
            sequenceName = "booking_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "booking_sequence"
    )
    private Long id;

    private String service;
    private String name;
    private String email;
    private LocalDate date;
    private String time;
    private String phone;

    public Booking() {
    }

    public Booking(Long id, String phone, String time, LocalDate date, String email, String name, String service) {
        this.id = id;
        this.phone = phone;
        this.time = time;
        this.date = date;
        this.email = email;
        this.name = name;
        this.service = service;
    }

    // You can also use this constructor without `id` for POSTs
    public Booking(String phone, String time, LocalDate date, String email, String name, String service) {
        this.phone = phone;
        this.time = time;
        this.date = date;
        this.email = email;
        this.name = name;
        this.service = service;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
