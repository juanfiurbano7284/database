package com.ps.registro.modelo;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name="registro")
@Entity
@Data
public class registro {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="registro", nullable=false)
    private Date registro;



    @ManyToOne
    @JoinColumn(name="persona_id", referencedColumnName = "id", nullable = false)
    private persona persona_id;
}
