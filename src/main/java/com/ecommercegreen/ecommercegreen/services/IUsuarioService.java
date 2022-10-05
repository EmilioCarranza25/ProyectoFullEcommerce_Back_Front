package com.ecommercegreen.ecommercegreen.services;

import com.ecommercegreen.ecommercegreen.model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    Optional<Usuario> findById(Integer id);

    Usuario save (Usuario usuario);
    Optional<Usuario> findByEmail(String email);

}
