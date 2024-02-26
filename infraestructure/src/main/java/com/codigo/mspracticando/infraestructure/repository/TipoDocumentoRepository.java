package com.codigo.mspracticando.infraestructure.repository;

import com.codigo.mspracticando.infraestructure.entity.PersonaEntity;
import com.codigo.mspracticando.infraestructure.entity.TipoDocumentoEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity,Long> {
    TipoDocumentoEntity findByCodTipo(@Param("codTipo") String codTipo);
}
