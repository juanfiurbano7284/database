package co.com.ps.registro.services;

import co.com.ps.registro.modelo.Persona;

public interface IPersonaService  {

     Persona guardar(Persona persona) throws Exception;

     Persona consultar(Long id)throws Exception;

     Persona actualizar(Persona persona)throws Exception;

     Persona borrar(Long id)throws Exception;
}