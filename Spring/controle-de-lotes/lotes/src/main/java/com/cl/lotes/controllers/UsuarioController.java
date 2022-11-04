package com.cl.lotes.controllers;

import com.cl.lotes.Models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Guilherme");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("Carvalho");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario postUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Guilherme");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("Carvalho");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario deleteUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Guilherme");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("Carvalho");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNome("Guilherme");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("Carvalho");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        return usuario;
    }
}
