package com.codigo.mspracticando.application.controller;

import com.codigo.mspracticando.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspracticando.domain.aggregates.request.RequestPersona;
import com.codigo.mspracticando.domain.ports.in.PersonaServiceIn;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@OpenAPIDefinition(
        info = @Info(
                title = "Api Persona",
                version = "2.0",
                description = "Mantenimiento deuna persona"
        )
)
@RestController

@RequestMapping("/v2/persona")
public class PersonaController {

    @Autowired
    @Qualifier("personaServiceImpl")
    private PersonaServiceIn personaServiceIn;

    @Autowired
    @Qualifier("personaServiceImplOther")
    private PersonaServiceIn personaServiceInOther;


    @Operation(summary = "Api paera crear persona")
    @PostMapping
    public ResponseEntity<PersonaDTO> registrar(@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(personaServiceIn.crearPersonaIn(requestPersona));
    }


    @Operation(summary = "Api paera optener persona")
    @GetMapping("/{numDoc}")
    public ResponseEntity<PersonaDTO>obtenerPersona(@PathVariable String numDoc){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtenerPersonaIn(numDoc).get());

    }

    @Operation(summary = "Api paera obtener todas las persona activas")
    @GetMapping()
    public ResponseEntity<List<PersonaDTO>>obtenerTodos(){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceIn.obtnerTodosIn());

    }

    @Operation(summary = "Api para actualizar una persona")

    @PutMapping("/{id}")
    public ResponseEntity<PersonaDTO>actualizar(@PathVariable Long id,@RequestBody RequestPersona requestPersona){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceInOther.actualizarIn(id,requestPersona));

    }

    @Operation(summary = "Api para eliminar persona")

    @DeleteMapping("/{id}")
    public ResponseEntity<PersonaDTO>delete(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(personaServiceInOther.deleteIn(id));

    }

}
