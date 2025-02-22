package com.example.demo.Models;


import com.example.demo.Enum.ERuolo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name= "utenti" )
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_utente;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "creatore" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<Evento> eventiCreati;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ERuolo ruolo;
}
