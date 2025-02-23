package com.example.demo.Controller;


import com.example.demo.Models.Utente;
import com.example.demo.Service.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    public UtenteService utenteService;

    @PostMapping("/register")
    public Utente registerUser(@RequestBody Utente user) {
        return utenteService.registerUser(user);
    }
}