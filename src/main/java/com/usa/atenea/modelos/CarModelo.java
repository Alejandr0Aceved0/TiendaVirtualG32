package com.usa.atenea.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")//FUNCIONA COMO UN ALIAS PARA NO LLAMAR A LA TABLA COMO ClientModelo sino client
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarModelo {
    @Id
    private int id;
    private String brand;
    private int model;
    private String category_id;
}
