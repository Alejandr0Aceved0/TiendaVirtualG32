package com.usa.atenea.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")//FUNCIONA COMO UN ALIAS PARA NO LLAMAR A LA TABLA COMO ClientModelo sino client
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientModelo {
    @Id
    private int id;
    private String name;
    private String email;
    private int age;
}
