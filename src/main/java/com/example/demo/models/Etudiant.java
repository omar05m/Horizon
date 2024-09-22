package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data // Génère automatiquement les getters, setters, toString, equals, hashCode
@NoArgsConstructor // Génère un constructeur sans paramètres
@AllArgsConstructor // Génère un constructeur avec tous les paramètres
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private LocalDate dateDeNaissance;
    private String adresse;

    @ManyToOne
    private Groupe groupe;

    @OneToMany(mappedBy = "etudiant")
    private List<Paiement> paiements;
}