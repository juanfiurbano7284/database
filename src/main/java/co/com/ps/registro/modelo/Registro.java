package co.com.ps.registro.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Table
@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Registro {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="registro", nullable=false)
    private Date registro;


    @ManyToOne(targetEntity = Persona.class)
    @JoinColumn(name="persona_id", referencedColumnName="id", nullable=false)
    private Persona persona_id;


}