package com.ecareserverapp.accommodation.controller;

import com.ecareserverapp.accommodation.entity.Accommodation;
import com.ecareserverapp.accommodation.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccommodationEndpoint {

    private final AccommodationService accommodationService;

    @Autowired
    public AccommodationEndpoint(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @GetMapping("/test")
    String test() {
        return "test";
    }

    @GetMapping("/{id}")
    public Accommodation getAccommodation(@PathVariable Long id) {
        return accommodationService.getAccommodation(id);
    }

    @GetMapping("/")
    public Iterable<Accommodation> getAllAccommodations() {
        return accommodationService.getAllAccommodations();
    }

    @PostMapping("/")
    public Accommodation saveAccommodation(@RequestBody Accommodation accommodation) {
        return accommodationService.saveAccommodation(accommodation);
    }

    @PutMapping("/")
    public Accommodation updateAccommodation(@RequestBody Accommodation accommodation) {
        return accommodationService.updateAccommodation(accommodation);
    }

    @DeleteMapping("/{id}")
    public void deleteAccommodation(@PathVariable Long id) {
        accommodationService.deleteAccommodation(id);
    }
}
