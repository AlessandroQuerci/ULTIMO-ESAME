package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_prenotazioni;

    @Column(nullable = false)
    private int numeroPosti;

    @Column(nullable = false)
    private LocalDate dataPrenotazione;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_evento")
    private Evento evento;

    @ManyToOne
    @JoinColumn(nullable = false, name = "id_utente")
    private Utente utente;


    public Prenotazione(int numeroPosti, LocalDate dataPrenotazione, Evento evento, Utente utente) {
        this.numeroPosti = numeroPosti;
        this.dataPrenotazione = LocalDate.now();
        this.evento = evento;
        this.utente = utente;
    }
}
