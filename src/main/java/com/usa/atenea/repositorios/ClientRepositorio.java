package com.usa.atenea.repositorios;

import com.usa.atenea.modelos.ClientModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositorio extends JpaRepository<ClientModelo, Integer> {
}
