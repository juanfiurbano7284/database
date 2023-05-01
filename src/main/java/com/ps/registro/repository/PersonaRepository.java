package com.ps.registro.repository;

import com.ps.registro.modelo.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<persona, Long> {
}
