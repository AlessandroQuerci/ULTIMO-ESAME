package com.example.demo.Service;

import com.example.demo.Models.Evento;
import com.example.demo.Models.Prenotazione;
import com.example.demo.Models.Utente;
import com.example.demo.Repository.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione prenotaEvento(Utente user , Evento evento){
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(user);
        prenotazione.setEvento(evento);
        return prenotazioneRepository.save(prenotazione);
    }

    public List<Prenotazione> getUserPrenotazioni(Utente user){
        return prenotazioneRepository.findByUserId(user.getId_utente());
    }
}
