package com.portafolio.service;

import com.portafolio.model.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> verPersonas();
    public void agregarPersona(Persona persona);
    public void eliminarPersona(Long id);
    public Persona buscarPersona(Long id);
}
