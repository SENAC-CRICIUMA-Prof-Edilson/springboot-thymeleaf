package com.crud.fase2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.fase2.model.UsuarioEntity;
import com.crud.fase2.repository.UsuarioRepository;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepositorio;

    @PostMapping (value = "/salvar")
    public ResponseEntity<UsuarioEntity> salvar(@ModelAttribute UsuarioEntity _usuario) {
        UsuarioEntity _user = usuarioRepositorio.save(_usuario);
        return new ResponseEntity<>(_user, HttpStatus.CREATED);
        //return ResponseEntity.ok().body(_usuario);
    }
}
