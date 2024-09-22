package com.example.demo.controllers;

import com.example.demo.models.Calendrier;
import com.example.demo.services.CalendrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calendriers")
public class CalendrierController {

    @Autowired
    private CalendrierService calendrierService;

    @PostMapping
    public ResponseEntity<Calendrier> creerCalendrier(@RequestBody Calendrier calendrier) {
        return ResponseEntity.ok(calendrierService.creerCalendrier(calendrier));
    }

    @GetMapping
    public ResponseEntity<List<Calendrier>> obtenirTousLesCalendriers() {
        return ResponseEntity.ok(calendrierService.obtenirTousLesCalendriers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendrier> obtenirCalendrierParId(@PathVariable Long id) {
        return ResponseEntity.ok(calendrierService.obtenirCalendrierParId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerCalendrier(@PathVariable Long id) {
        calendrierService.supprimerCalendrier(id);
        return ResponseEntity.noContent().build();
    }
}
