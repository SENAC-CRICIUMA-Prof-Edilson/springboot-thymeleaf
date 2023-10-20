package com.crud.fase2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.fase2.repository.UsuarioRepository;

@Controller
public class RouterController {
    

    @Autowired
    private UsuarioRepository usuario_repositorio;

    @GetMapping(value = "/form")
    public String usuario(){
        return "form";
    }

    @GetMapping(value = "/list")
    public String listar(Model model){
        model.addAttribute("usuarios", usuario_repositorio.findAll());

        return "list";
    }

    @GetMapping(value = "/excluir/{id}")
    public String excluir(@PathVariable Long id){

        usuario_repositorio.deleteById(id);
        return "excluido";
    }
}