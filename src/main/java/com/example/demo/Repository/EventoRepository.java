package com.example.demo.Repository;

import com.example.demo.Models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoRepository extends JpaRepository<Evento , Long> {

    List<Evento> findByOrgannizatoreId (long organizzatoreId);
}
