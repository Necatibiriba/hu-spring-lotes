package com.cl.lotes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicamentoController {

    @RequestMapping(value = "teste")
    public String teste() {
        return "test";
    }
}
