package com.ecommercegreen.ecommercegreen.services;

import com.ecommercegreen.ecommercegreen.model.Orden;
import com.ecommercegreen.ecommercegreen.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IOrdenService {
    Orden save (Orden orden);
    Optional<Orden> findById(Integer id);
    List<Orden> findAll();
    String generarNumeroOrden();
    List<Orden> findByUsuario (Usuario usuario);
}
