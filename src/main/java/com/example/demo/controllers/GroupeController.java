package com.example.demo.controllers;

import com.example.demo.models.Groupe;
import com.example.demo.services.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groupes")
public class GroupeController {

    @Autowired
    private GroupeService groupeService;

    @PostMapping
    public ResponseEntity<Groupe> creerGroupe(@RequestBody Groupe groupe) {
        return ResponseEntity.ok(groupeService.creerGroupe(groupe));
    }

    @GetMapping
    public ResponseEntity<List<Groupe>> obtenirTousLesGroupes() {
        return ResponseEntity.ok(groupeService.obtenirTousLesGroupes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Groupe> obtenirGroupeParId(@PathVariable Long id) {
        return ResponseEntity.ok(groupeService.obtenirGroupeParId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> supprimerGroupe(@PathVariable Long id) {
        groupeService.supprimerGroupe(id);
        return ResponseEntity.noContent().build();
    }
}
