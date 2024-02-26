package com.codigo.mspracticando.infraestructure.repository;

import com.codigo.mspracticando.infraestructure.entity.PersonaEntity;
import com.codigo.mspracticando.infraestructure.entity.TipoPersonaEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPersonaRepository extends JpaRepository<TipoPersonaEntity,Long> {
    TipoPersonaEntity findByCodTipo(@Param("x") String codTipo);


}
