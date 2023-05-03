package com.usa.atenea.repositorios;

import com.usa.atenea.modelos.CarModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//AQUI DECIMOS QUE JPA MAPEE UNA ESTRUCUTRA DE DATOS SEGUN UN MODELO Y EL TIPO DE DATO DEL PRIMARY ID, EN ESTE CASO Integer
public interface CarInterfaz extends JpaRepository<CarModelo, Integer> {

}
