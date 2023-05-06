package co.com.ps.registro.services;

import co.com.ps.registro.modelo.Persona;
import co.com.ps.registro.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaService implements  IPersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Transactional()
    @Override
    public Persona guardar(Persona persona) throws Exception {

        if (persona.getId() < 0) {
            throw new Exception("El empleado no puede tener numeros menores o iguales a 0");
        }
        if (persona.getCorreo() == null || persona.getCorreo().equals("")) {
            throw new Exception("El usuario no tiene correo");
        }
        if (persona.getIdentificacion() == null || persona.getIdentificacion().equals("")) {
            throw new Exception("El usuario no tiene identificacion");
        }


        return personaRepository.save(persona);
    }

    @Override
    public Persona consultar(Long id) throws Exception {

        if (id == null || id < 1) {
            throw new Exception("El id enviado no es valido");
        }

        Persona p = personaRepository.getOne(id);

        return p;
    }

    @Override
    @Transactional()
    public Persona actualizar(Persona persona) throws Exception {

        Persona resultado = consultar(persona.getId());

        if (persona.getCorreo() != null && !persona.getCorreo().equals("")) {
            resultado.setCorreo(persona.getCorreo());
        }

        if (persona.getNombres() != null && !persona.getNombres().equals("")) {
            resultado.setNombres(persona.getNombres());
        }

        if (persona.getApellidos() != null && !persona.getApellidos().equals("")) {
            resultado.setApellidos(persona.getApellidos());
        }

        if (persona.getFecha_nacimiento() != null && !persona.getFecha_nacimiento().equals("")) {
            resultado.setFecha_nacimiento(persona.getFecha_nacimiento());
        }
        if (persona.getTelefono() != null && !persona.getTelefono().equals("")) {
            resultado.setTelefono(persona.getTelefono());
        }
        if (persona.getIdentificacion() != null && !persona.getIdentificacion().equals("")) {
            resultado.setIdentificacion(persona.getIdentificacion());
        }

        return personaRepository.save(persona);
    }

    @Override
    public Persona borrar(Long id) throws Exception {
        if (personaRepository.existsById(id)) {
            personaRepository.deleteById(id);
        } else {
            throw new Exception("Id invalido");
        }
        return null;
    }
}


