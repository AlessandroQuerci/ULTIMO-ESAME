package com.example.demo.Controller;


import com.example.demo.Models.Evento;
import com.example.demo.Models.Utente;
import com.example.demo.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventoController {

    @Autowired
    public EventoService eventoService;

    @PostMapping
    public Evento createEvent(@RequestBody Evento evento, @AuthenticationPrincipal Utente organizer) {
        return eventoService.creaEvento(evento, organizer);
    }

    @GetMapping("/my-events")
    public List<Evento> getMyEvents(@AuthenticationPrincipal Utente organizer) {
        return eventoService.getEventoByOrganizzatore(organizer);
    }
}

