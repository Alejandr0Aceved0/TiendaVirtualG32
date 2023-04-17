package com.usa.atenea.controlador;

import com.usa.atenea.dtos.UsuariosDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UsuariosControlador {

    @GetMapping("/usuarios")
    public String obtenerUsuarios(){
        //LOGICA PARA REALIZAR UNA PETICION GET
        return "HOLA MUNDO";
    }

    @PostMapping("/usuarios")
    public ResponseEntity<UsuariosDto> crearUsuarios(@RequestBody UsuariosDto usuariosDto){
        return ResponseEntity.status(201).body(usuariosDto);
    }

    @DeleteMapping("/usuarios")
    public void eliminarUsuarios(@RequestParam int id){
        System.out.printf("id: "+ id);
    }

    @PutMapping("/usuarios")
    public void actualizarUsuarios(@RequestBody UsuariosDto usuariosDto){
        System.out.printf(usuariosDto.toString());
    }
}
