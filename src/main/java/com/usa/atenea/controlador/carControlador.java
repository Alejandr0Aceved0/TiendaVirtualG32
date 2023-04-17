package com.usa.atenea.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class carControlador {
    @GetMapping("/car")
    public String obtenerCar(){
        return "HOLA MUNDO";
    }
}
