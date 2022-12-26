package com.portafolio.service;

import com.portafolio.model.Persona;
import com.portafolio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository personaRepository;

    @Override
    public void agregarPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

}

