package com.ps.registro.services;

import com.ps.registro.modelo.persona;
import com.ps.registro.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService implements  IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Transactional()
    @Override
    public persona guardar(persona Persona) throws Exception {

        if (Persona.getId() < 0) {
            throw new Exception("El empleado no puede tener numeros menores o iguales a 0");
        }
        if (Persona.getCorreo() == null || Persona.getCorreo().equals("")) {
            throw new Exception("El usuario no tiene correo");
        }
        if (Persona.getIdentificacion() == null || Persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene identificacion");
        }


        //TODO Terminar las validaciones.

        return  personaRepository.save(Persona);
    }

    @Override
    public persona consultar(Long id) throws Exception {

        if (id==null || id<1){
            throw new Exception("El id enviado no es valido");
        }

        return personaRepository.getOne(id);
    }

    @Override
    @Transactional()
    public persona actualizar(persona persona) throws Exception {

        persona resultado=consultar(persona.getId());

        if (persona.getCorreo() != null && !persona.getCorreo().equals("")) {
            resultado.setCorreo(persona.getCorreo());
        }

        if (persona.getNombres() != null && !persona.getNombres().equals("")) {
            resultado.setNombres(persona.getNombres());
        }




        //TODO Terminar las validaciones.

        return  personaRepository.save(persona);
    }
}
