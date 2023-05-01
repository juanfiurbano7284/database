package com.ps.registro.controller;


import com.ps.registro.modelo.persona;
import com.ps.registro.modelo.registro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @GetMapping("/{id}")
    public ResponseEntity<registro> consultar(@PathVariable("id") int id){
        registro Registro = new registro ();
        Registro.setId(id);
        return ResponseEntity.ok(Registro);
    }

    @PostMapping("/")
    public ResponseEntity<registro> guardar(@RequestBody registro Registro ){

        return ResponseEntity.ok(Registro);
    }

    @PutMapping("/")
    public ResponseEntity<registro> actualizar(@RequestBody registro Registro ){

        return ResponseEntity.ok(Registro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<registro> borrar(@PathVariable("id") int id){

        registro Registro = new registro();
        Registro.setId(id);
        return ResponseEntity.ok(Registro);
    }


}
