package com.example.demo.Payload;


import jakarta.validation.constraints.Min;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PrenotazioneDTO {

    @NotNull(message = "Questo campo è obbligatorio!")
    private long idEvento;

    @NotNull(message = "Questo campo è obbligatorio!")
    @Min(value = 1)
    private int postiPrenotati;


}
