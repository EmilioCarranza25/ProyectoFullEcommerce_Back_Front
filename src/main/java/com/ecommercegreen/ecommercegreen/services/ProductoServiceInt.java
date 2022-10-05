package com.ecommercegreen.ecommercegreen.services;

import com.ecommercegreen.ecommercegreen.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoServiceInt {
    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
    public List<Producto> findAll();
}
