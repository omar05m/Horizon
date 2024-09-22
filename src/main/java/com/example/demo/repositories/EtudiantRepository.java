package com.example.demo.repositories;

import com.example.demo.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
}
