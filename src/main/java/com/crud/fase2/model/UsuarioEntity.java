package com.crud.fase2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
public class UsuarioEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String nome;
    public String login;
    public String email;
    public String senha;
}