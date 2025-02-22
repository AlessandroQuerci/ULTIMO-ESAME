package com.example.demo.Payload;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EventoDTO {

    @NotBlank(message = "Questo campo è obbligatorio!")
    private String titolo;

    @NotBlank(message = "Questo campo è obbligatorio!")
    private String luogoEvento;

    private String descrizione;

    @NotBlank(message = "Questo campo è obbligatorio!")
    private LocalDate dataEvento;

    @NotBlank(message = "Questo campo è obbligatorio!")
    @Min(value = 1)
    private int postiDisponibili;

}
