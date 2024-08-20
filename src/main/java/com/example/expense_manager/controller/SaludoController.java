package com.example.expense_manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//clase de prueba
@RestController
public class SaludoController {

    @GetMapping("/hola")
    public String HolaMundo() {
        return "Hola Mundokkkk";
    }
}
