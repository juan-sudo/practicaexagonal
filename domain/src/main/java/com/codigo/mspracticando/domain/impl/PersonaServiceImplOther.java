package com.codigo.mspracticando.domain.impl;

import com.codigo.mspracticando.domain.aggregates.dto.PersonaDTO;
import com.codigo.mspracticando.domain.aggregates.request.RequestPersona;
import com.codigo.mspracticando.domain.ports.in.PersonaServiceIn;
import com.codigo.mspracticando.domain.ports.out.PersonaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class PersonaServiceImplOther implements PersonaServiceIn {

    @Autowired
    private PersonaServiceOut personaServiceOut;
    @Override
    public PersonaDTO crearPersonaIn(RequestPersona requestPersona) {
        return null;
    }

    @Override
    public Optional<PersonaDTO> obtenerPersonaIn(String numDoc) {
        return Optional.empty();
    }

    @Override
    public List<PersonaDTO> obtnerTodosIn() {
        return null;
    }

    @Override
    public PersonaDTO actualizarIn(Long id, RequestPersona requestPersona) {
        return personaServiceOut.actualizarOut(id,requestPersona);
    }

    @Override
    public PersonaDTO deleteIn(Long id) {
        return personaServiceOut.deleteOut(id);
    }
}
