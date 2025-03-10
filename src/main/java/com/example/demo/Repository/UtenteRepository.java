package com.example.demo.Repository;

import com.example.demo.Models.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtenteRepository extends JpaRepository <Utente , Long> {

    Optional<Utente> findByEmail(String email);
}
