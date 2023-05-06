package co.com.ps.registro.controller;

import co.com.ps.registro.modelo.Persona;
import co.com.ps.registro.modelo.Registro;
import co.com.ps.registro.modelo.dto.ResponseErrorDTO;
import co.com.ps.registro.services.IRegistroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    IRegistroService iRegistroService;
    private static final Logger logger = LoggerFactory.getLogger(RegistroController.class);


    @GetMapping("/{id}")
    public ResponseEntity<?> consultar(@PathVariable("id") Long id) {
        try {
            Registro resultado=  iRegistroService.consultar(id);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }

    }

    @PostMapping("/")
    public ResponseEntity<?> guardar(@RequestBody Registro registro) {
        try {
            Registro resultado=  iRegistroService.guardar(registro);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }

    }

    @PutMapping("/")
    public ResponseEntity<?> actualizar(@RequestBody Registro registro) {
        try {
            Registro resultado=  iRegistroService.actualizar(registro);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id") Long id) {
        try {
            Registro resultado=  iRegistroService.borrar(id);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(resultado);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseErrorDTO(HttpStatus.BAD_REQUEST.toString(), e.getCause() + "", e.getMessage()));
        }
    }

}