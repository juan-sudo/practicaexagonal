package com.codigo.mspracticando.domain.ports.in;

import com.codigo.mspracticando.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspracticando.domain.aggregates.request.RequestPersona;
import feign.Request;

import java.util.List;
import java.util.Optional;

public interface PersonaServiceIn {
    PersonaDTO crearPersonaIn(RequestPersona requestPersona);
    Optional<PersonaDTO> obtenerPersonaIn(String numDoc);

    List<PersonaDTO> obtnerTodosIn();
    PersonaDTO actualizarIn(Long id, RequestPersona requestPersona);
    PersonaDTO deleteIn(Long id);
}
