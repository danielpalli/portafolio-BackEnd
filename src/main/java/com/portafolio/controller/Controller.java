package com.portafolio.controller;

import com.portafolio.model.Persona;
import com.portafolio.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller implements IPersonaService {

    @Autowired
    private IPersonaService personaService;

    @PostMapping("/new/persona")
    public void agregarPersona( @RequestBody Persona persona ) {
        personaService.agregarPersona(persona);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersonas (){
        return personaService.verPersonas();
    }

    @DeleteMapping("/delete/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
    }

    @GetMapping("/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return personaService.buscarPersona(id);
    }


}
