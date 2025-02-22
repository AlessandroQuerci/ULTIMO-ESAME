package com.example.demo.Payload;


import com.example.demo.Enum.ERuolo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UtenteDTO {

@NotBlank(message = "Questo campo è obbligatorio!")
    private String nome;

    @NotBlank(message = "Questo campo è obbligatorio!")
    private String cognome;

@NotBlank(message = "Questo campo è obbligatorio!")
    private String username;

@NotBlank(message = "Questo campo è obbligatorio!")
    private String password;

@NotBlank(message = "Questo campo è obbligatorio!")
    @Email(message = "Devi inserire un e-mail valida!")
    private String email;

private ERuolo ruolo;


}

