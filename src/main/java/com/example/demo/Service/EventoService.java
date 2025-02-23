package com.example.demo.Service;


import com.example.demo.Models.Evento;
import com.example.demo.Models.Utente;
import com.example.demo.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
@Autowired
    private EventoRepository eventoRepository;

public Evento creaEvento(Evento evento, Utente organizzatore){
    evento.setCreatore(organizzatore);
    return eventoRepository.save(evento);
}

public List<Evento> getEventoByOrganizzatore(Utente organizzatore){
    return eventoRepository.findByOrgannizatoreId(organizzatore.getId_utente());
}
}
