package com.ecommercegreen.ecommercegreen.repository;

import com.ecommercegreen.ecommercegreen.model.Orden;
import com.ecommercegreen.ecommercegreen.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario (Usuario usuario);

}

