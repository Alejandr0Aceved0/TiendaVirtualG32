package com.usa.atenea.controlador;

import com.usa.atenea.modelos.CarModelo;
import com.usa.atenea.servicios.CarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarControlador {

    @Autowired
    CarServicio carServicio;

    @GetMapping("/car")
    public Optional<CarModelo> obtenerCarPorId(@RequestParam int id) {
        return carServicio.obtenerCarPorId(id);
    }

    @GetMapping("/all-cars")
    public List<CarModelo> obtenerAllCars() {
        return carServicio.obtenerTodosCar();
    }

    @DeleteMapping("/car")
    public void eliminarCarPorId(@RequestParam int id) {
        carServicio.eliminarCarPorId(id);
    }

    @PostMapping("/create-car")
    public void crearCar(@RequestBody CarModelo carModelo) {
//        CON LA NOTACION @RequestBody PODEMOS VOLVER IMPLICITO
//        QUE LA ENTIDAD CarModelo ES LA ESTRUCTURA BODY PARA LA PETICION, EJEMPLO:
//        {
//                "id": 1,
//                "brand": "DUCATI",
//                "model": 2023,
//                "category_id": 5
//        }
        carServicio.crearCar(carModelo);
    }

    @PutMapping("/update-car")
    public void actualizarCar(@RequestBody CarModelo carModelo) {
//        CON LA NOTACION @RequestBody PODEMOS VOLVER IMPLICITO
//        QUE LA ENTIDAD CarModelo ES LA ESTRUCTURA BODY PARA LA PETICION, EJEMPLO:
//        {
//                "id": 1,
//                "brand": "DUCATI",
//                "model": 2023,
//                "category_id": 5
//        }
        carServicio.actualizarCarPorId(carModelo);
    }
}
