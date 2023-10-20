package com.crud.fase2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.fase2.model.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

}
