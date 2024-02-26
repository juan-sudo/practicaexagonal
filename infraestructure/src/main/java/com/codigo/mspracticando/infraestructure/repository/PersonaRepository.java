package com.codigo.mspracticando.infraestructure.repository;

import com.codigo.mspracticando.infraestructure.entity.PersonaEntity;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {
    PersonaEntity findByNumDocu(@Param("numDocu") String numDocu);
    List<PersonaEntity> findByEstado(@Param("estado") Integer estado);
}
