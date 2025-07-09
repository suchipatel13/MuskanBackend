package com.muskan.demo.Controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner init(BookingRepository bookingRepository) {
        return args -> {
            Booking booking = new Booking(
                    "8564341306",
                    "01:00PM",
                    LocalDate.of(2025, 7, 11),
                    "suchipatel1915@gmail.com",
                    "Suchi Patel",
                    "Men Eyebrows ($16.00)"
            );


            bookingRepository.save(booking);          // save to database
        };
    }
}
