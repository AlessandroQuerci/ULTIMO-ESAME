package com.example.demo.Repository;

import com.example.demo.Models.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione , Long> {
List<Prenotazione> findByUserId (long userId);
List<Prenotazione> findByEventoId(long eventoId);

}
