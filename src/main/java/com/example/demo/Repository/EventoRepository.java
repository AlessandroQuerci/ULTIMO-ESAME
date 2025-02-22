package com.example.demo.Repository;

import com.example.demo.Models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento , Long> {
}
