package com.usa.atenea.servicios;

import com.usa.atenea.modelos.CarModelo;
import com.usa.atenea.repositorios.CarInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServicio {
    @Autowired
    CarInterfaz carInterfaz;

    public Optional<CarModelo> obtenerCarPorId(int id){ //Optional funciona como un excepcion null, como un try catch para evitar que la funcion haga crash
        return carInterfaz.findById(id); // findById --> funciona como un select * from tabla where id = id
    }
    public List<CarModelo> obtenerTodosCar(){//retorna una coleccion en lista para devolver varios registros en diferentes posiciones de tipo modelo carModelo
        return carInterfaz.findAll(); // findAll --> funcona como un select * from
    }
    public void crearCar(CarModelo carModelo){
        if (!carInterfaz.existsById(carModelo.getId())){
            carInterfaz.save(carModelo);
        }
    }
    public void eliminarCarPorId(int id){
        carInterfaz.deleteById(id);
    }
    public void actualizarCarPorId(CarModelo carModelo){
        if (carInterfaz.existsById(carModelo.getId())){
            carInterfaz.save(carModelo);
        }
    }
}
