package com.cl.lotes.controllers;

import com.cl.lotes.Models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("Guilherme");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("Carvalho");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        Usuario usuario1 = new Usuario();
        usuario.setId(2L);
        usuario.setNome("Nat");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("silva");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        Usuario usuario2 = new Usuario();
        usuario.setId(3L);
        usuario.setNome("dabila");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("alves");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);

        return usuarios;
    }


    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNome("Guilherme");
        usuario.setEmail("HU@HU.COM");
        usuario.setSobrenome("Carvalho");
        usuario.setTelefone("14557455");
        usuario.setPassword("senha");

        return usuario;
    }
/*
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
    }*/
}
