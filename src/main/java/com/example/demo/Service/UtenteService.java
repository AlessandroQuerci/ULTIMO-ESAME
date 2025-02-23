package com.example.demo.Service;


import com.example.demo.Models.Utente;
import com.example.demo.Repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Utente registerUser(Utente user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return utenteRepository.save(user);
    }
}
