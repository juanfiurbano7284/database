package com.ps.registro.services;

import com.ps.registro.modelo.persona;

public interface IPersonaService  {

    persona guardar(persona Persona) throws Exception;

    persona consultar(Long id)throws Exception;

    persona actualizar(persona Persona)throws Exception;
}