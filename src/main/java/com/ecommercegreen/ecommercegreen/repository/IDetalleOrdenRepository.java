package com.ecommercegreen.ecommercegreen.repository;

import com.ecommercegreen.ecommercegreen.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {
}
